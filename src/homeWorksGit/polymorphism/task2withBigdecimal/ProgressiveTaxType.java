package homeWorksGit.polymorphism.task2withBigdecimal;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    public ProgressiveTaxType() {
    }

    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.valueOf(99999L)) > 0) {
            amount = amount.multiply(BigDecimal.valueOf(0.15));
        } else {
            amount = amount.multiply(BigDecimal.valueOf(0.1));
        }
        return amount;
    }
}
