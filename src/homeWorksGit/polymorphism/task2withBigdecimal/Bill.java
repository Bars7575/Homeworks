package homeWorksGit.polymorphism.task2withBigdecimal;

import java.math.BigDecimal;

public class Bill {
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        new BigDecimal("0.00");
        BigDecimal taxAmount = this.taxType.calculateTaxFor(this.amount);
        this.taxService.payOut(taxAmount);
    }
}

