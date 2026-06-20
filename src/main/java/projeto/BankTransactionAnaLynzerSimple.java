package projeto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BankTransactionAnaLynzerSimple {
    private static final String RESOURCES = "src/main/resorces/";
    public static void main(String[] args)  throws IOException {
        final Path path = Path.of(RESOURCES + args[0]);
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for (final String line : lines) {
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total = total + amount;
        }
        System.out.println("Total de dados: " + total);
    }
}

//*CSV coma separated values (valores separados por virgulas)