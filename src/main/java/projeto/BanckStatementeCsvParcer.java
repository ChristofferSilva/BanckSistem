package projeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BanckStatementeCsvParcer {

    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private BanckTransaction parseFromCSV(final String line) {

        final String[] fields = line.split(",");

        final LocalDate date =
                LocalDate.parse(fields[0], formatter);

        final double amount =
                Double.parseDouble(fields[1]);

        final String description =
                fields[2];

        return new BanckTransaction(
                date,
                amount,
                description
        );
    }

    public List<BanckTransaction> parseLinesFromCSV(
            final List<String> lines) {

        final List<BanckTransaction> transactions =
                new ArrayList<>();

        for (String line : lines) {
            transactions.add(parseFromCSV(line));
        }

        return transactions;
    }
}