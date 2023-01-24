package homeWorksGit.polymorphism.task2;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(10000,new IncomeTaxType(), new TaxService() ),
                new Bill(99999,new ProgressiveTaxType(), new TaxService() ),
                new Bill(100000,new ProgressiveTaxType(), new TaxService() ),
                new Bill(30000,new VaTaxType(), new TaxService() ),
        };
        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
