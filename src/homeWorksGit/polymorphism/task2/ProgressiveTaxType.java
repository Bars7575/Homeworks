package homeWorksGit.polymorphism.task2;

public class ProgressiveTaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        if(amount >= 100000){
            amount = amount * 0.15;
        }else {
            amount = amount * 0.1;
        }
        return amount;
    }
}
