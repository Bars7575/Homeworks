package homeWorksGit.polymorphism.task2withBigdecimal;

import java.math.BigDecimal;

public class TaxService {
    public TaxService() {
    }

    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
    }
}
