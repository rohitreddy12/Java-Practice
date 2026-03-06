package BankingApplication;

interface BankInterface{
    public void addMoney(User user,int amount);
    public void subtractMoney(User user,int amount) throws NeedMinBalanceException, InsufficientFunds;
    public void addAccount(User user);
    public void deleteAccount(User user);
}

class NeedMinBalanceException extends Exception{
    public NeedMinBalanceException(){
        super("Money withdrawn below minimum balance");
    }
}

class InsufficientFunds extends Exception{
    public InsufficientFunds(){
        super("Insufficient funds in the account.Cannot withdraw money");
    }
}


public class Bank implements BankInterface {

    @Override
    public void addMoney(User user, int amount) {
        int currBalance = user.getBalance();
        user.setBalance(currBalance+amount);
        System.out.println("New balance amount:" + user.getBalance());
    }

    @Override
    public void subtractMoney(User user,int amount) throws NeedMinBalanceException, InsufficientFunds {
        int currBalance = user.getBalance();
        int userMinBal = user.getMinBalance();
        System.out.println(currBalance);
        if(currBalance < amount) {
            throw new InsufficientFunds();
        }
        if(currBalance-amount < userMinBal) throw new NeedMinBalanceException();
    }

    @Override
    public void addAccount(User user) {
        System.out.println("A new account has been opened for the user:" + user.toString());
    }

    @Override
    public void deleteAccount(User user) {
        System.out.println("User account deleted" + user.toString());
    }
    
}
