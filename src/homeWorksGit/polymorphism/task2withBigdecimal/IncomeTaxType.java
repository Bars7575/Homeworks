package homeWorksGit.polymorphism.task2withBigdecimal;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    public IncomeTaxType() {
    }

    public BigDecimal calculateTaxFor(BigDecimal amount) {
        amount = amount.multiply(BigDecimal.valueOf(0.13));
        return amount;
    }
}
