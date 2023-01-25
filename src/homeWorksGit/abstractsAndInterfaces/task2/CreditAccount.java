package homeWorksGit.abstractsAndInterfaces.task2;

public class CreditAccount extends Account{
    private int balance;


    public void setBalance(int balance) {
        if(balance > 0){
            System.out.println("На кредитном счете баланс не может быть положительным");
        }
        this.balance = balance;
    }

    public CreditAccount(int balance) {
        if(balance > 0){
            System.out.println("На кредитном счете баланс не может быть положительным");
        }
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    @Override
    public void pay(int amount) {
        balance = balance - amount;
        System.out.println("С вашего кредитного счета была совершена покупка на сумму" + amount +
                "Ваш кредит состовляет " + balance);
    }
    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Для  кредитного счета данная операция не доступна");
    }
    @Override
    public void addMoney(int amount) {
        if(balance + amount > 0){
            int enoughSum = 0 - balance;
            System.out.println("Для закрытия кредитного счета необходимо поолнить счет на сумму не более " + enoughSum);
        }else {
            balance = balance + amount;
            System.out.println("Ваш кредитный счета был пополнен на сумму " + amount + " Сумма кредита состовляет "
                    + balance);
        }
    }
    @Override
    public int transferToAccountBalance(int value) {
        balance = balance + value;
        return balance;
    }
    @Override
    public String accountName() {
        return " кредитный счет ";
    }
}
