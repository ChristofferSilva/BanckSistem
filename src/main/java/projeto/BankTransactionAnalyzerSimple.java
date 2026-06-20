package projeto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BankTransactionAnalyzerSimple {

    private static final String RESOURCES = "src/main/resources/";

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Informe o nome do arquivo CSV.");
            return;
        }

        final Path path = Path.of(RESOURCES + args[0]);

        final List<String> lines = Files.readAllLines(path);

        double total = 0d;

        for (final String line : lines) {
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }

        System.out.println("Total de dados: " + total);
    }
}