package homeWorksGit.abstractsAndInterfaces.task2;

public class CheckingAccount extends Account{
    private int balance;

    public void setBalance(int balance) {
        if(balance < 0){
            System.out.println("Баланс на расчетном счете не может быть отрицательным");
        }
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public CheckingAccount(int balance) {
        if(balance < 0){
            System.out.println("Баланс на расчетном счете не может быть отрицательным");
        }
        this.balance = balance;
    }
    @Override
    public void pay(int amount) {
        if(balance < 0 || (balance - amount) < 0){
            System.out.println("На вашем расчетном счете не достаточно средств");
        }else {
            balance = balance - amount;
            System.out.println("С вашего расчетного счета была совершена покупка на сумму " + amount +
                    " Доступная сумма " + balance);
        }
    }
    @Override
    public void transfer(Account account, int amount) {
        if(balance < 0 || (balance - amount) < 0){
            System.out.println("На вашем расчетном счете не достаточно средств");
        }else {
            balance = balance - amount;
            System.out.println("С вашего расчетного счета был совершен перевод на" + account.accountName() +
                    "на сумму " + amount + " Доступная сумма " + balance);
            account.transferToAccountBalance(amount);

        }
    }
    @Override
    public void addMoney(int amount) {
        balance = balance + amount;
        System.out.println("Ваш расчетный счет был пополнен на сумму " + amount + " Доступная сумма " + balance);
    }
    @Override
    public int transferToAccountBalance(int value) {
        balance = balance + value;
        return balance;
    }
    @Override
    public String accountName() {
        return " расчетный счет ";
    }
}
