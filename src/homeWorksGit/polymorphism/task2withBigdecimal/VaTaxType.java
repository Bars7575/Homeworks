package homeWorksGit.polymorphism.task2withBigdecimal;

import java.math.BigDecimal;

public class VaTaxType extends TaxType {
    public VaTaxType() {
    }

    public BigDecimal calculateTaxFor(BigDecimal amount) {
        amount = amount.multiply(BigDecimal.valueOf(0.18));
        return amount;
    }
}