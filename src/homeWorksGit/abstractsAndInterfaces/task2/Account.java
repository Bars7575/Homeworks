package homeWorksGit.abstractsAndInterfaces.task2;

public abstract class Account implements TransferOperations{
    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);
}
