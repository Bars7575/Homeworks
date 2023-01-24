package homeWorksGit.polymorphism.task2withBigdecimal;

import java.math.BigDecimal;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new TaxService();
        Bill[] payments = new Bill[]{new Bill(BigDecimal.valueOf(100000L), new IncomeTaxType(), new TaxService()), new Bill(BigDecimal.valueOf(99999L),
                new ProgressiveTaxType(), new TaxService()), new Bill(BigDecimal.valueOf(100000L),
                new ProgressiveTaxType(), new TaxService()), new Bill(BigDecimal.valueOf(100000L), new VaTaxType(), new TaxService())};

        for(int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
