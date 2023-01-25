package homeWorksGit.abstractsAndInterfaces.task2;

public class SavingAccount extends Account{
    private int balance;

    public void setBalance(int balance) {
        if(balance < 0){
            System.out.println("Баланс на сберегательном счете не может быть отрицательным");
        }
        this.balance = balance;

    }

    public int getBalance() {
        return balance;
    }

    public SavingAccount(int balance) {
        if(balance < 0){
            System.out.println("Баланс на сберегательном счете не может быть отрицательным");
        }
        this.balance = balance;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Для вашего сберегательного счета данная операция не доступна");
    }
    @Override
    public void transfer(Account account, int amount) {
        if(balance < 0 || (balance - amount) < 0){
            System.out.println("На вашем сберегательном счете не достаточно средств");
        }else {
            balance = balance - amount;
            System.out.println("С вашего сберегательного счета был совершен перевод на" +account.accountName() +
                    "на сумму " + amount + " Доступная сумма " + balance);
            account.transferToAccountBalance(amount);
        }
    }
    @Override
    public void addMoney(int amount) {
        balance = balance + amount;
        System.out.println("Ваш сберегательный счет был пополнен на сумму " + amount + " Доступная сумма " + balance);
    }
    @Override
    public int transferToAccountBalance(int value) {
        balance = balance + value;
        return balance;
    }

    @Override
    public String accountName() {
        return " сберегательный счет ";
    }
}
