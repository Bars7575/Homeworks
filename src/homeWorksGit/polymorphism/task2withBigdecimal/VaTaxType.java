package homeWorksGit.polymorphism.task2;

public class VaTaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        amount = amount * 0.18;
        return amount;
    }
}
