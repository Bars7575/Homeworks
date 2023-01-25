package homeWorksGit.abstractsAndInterfaces.task2;

public class Main {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount(1000);
        CreditAccount creditAccount = new CreditAccount(100);
        CreditAccount creditAccountTwo = new CreditAccount(-1000);
        CheckingAccount checkingAccount = new CheckingAccount(500);
        CheckingAccount checkingAccountTwo = new CheckingAccount(-200);

        System.out.println("Credit account two " + creditAccountTwo.getBalance());
        savingAccount.pay(100);
        savingAccount.transfer(checkingAccount, 2000);
        savingAccount.transfer(creditAccountTwo, 200);
        System.out.println("Saving account " + savingAccount.getBalance());
        System.out.println("Credit account two " + creditAccountTwo.getBalance());
        creditAccountTwo.addMoney(1200);
        savingAccount.transfer(checkingAccount, 800);
        System.out.println("Checking account " + checkingAccount.getBalance());
        System.out.println("Saving account " + savingAccount.getBalance());
    }
}
