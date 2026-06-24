package projeto;

import java.util.List;

public class BanckStatementProcessor {

    private final List<BanckTransaction> transactions;

    public BanckStatementProcessor(List<BanckTransaction> transactions) {
        this.transactions = transactions;
    }

    public double calculateTotal() {

        double total = 0;

        for (final BanckTransaction transaction : transactions) {
            total += transaction.getAmount();
        }

        return total;
    }

    public double calculateTotalForCategory(final String category) {

        double total = 0;

        for (final BanckTransaction transaction : transactions) {

            if (transaction.getDescription().equals(category)) {
                total += transaction.getAmount();
            }

        }

        return total;
    }
}