package homeWorksGit.polymorphism.task2;

public class IncomeTaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        amount = amount * 0.13;
        return amount;
    }
}
