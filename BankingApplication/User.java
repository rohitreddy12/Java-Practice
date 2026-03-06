package BankingApplication;

interface UserInterface{
    public void openAccount(User user);
    public void depositMoney(int amount);
    public void withDrawMoney(int amount);
    public void closeAccount(User user);
}

public class User implements UserInterface{
    private int accNo;
    private String userName;
    private int balance;
    private int minBalance = 500;

    private int minBalPenalty = 20;

    Bank bank = new Bank();

    public void setMinBalance(int minBalance) {
        this.minBalance = minBalance;
    }

    

    public int getBalance() {
        return balance;
    }



    public void setBalance(int balance) {
        this.balance = balance;
    }



    public int getMinBalance() {
        return minBalance;
    }



    public User(int accNo, String userName, int balance, int minBalance) {
        this.accNo = accNo;
        this.userName = userName;
        if(minBalance <= 0)setMinBalance(this.minBalance);
        this.balance = balance;
        this.openAccount(this);
    }

    @Override
    public void depositMoney(int amount) {
        bank.addMoney(this, amount);
    }

    @Override
    public void withDrawMoney(int amount) {
        try {
            bank.subtractMoney(this,amount);
        } catch (NeedMinBalanceException | InsufficientFunds e) {
            if(e.getClass().getSimpleName()== "NeedMinBalanceException"){
            System.out.println(e.getMessage());
            System.out.println("Penalty charges are debited from the account");
            int currBalance = this.getBalance();
            this.setBalance(currBalance-this.minBalPenalty);
            }
            else{
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void openAccount(User user) {
        bank.addAccount(user);
    }

    @Override
    public String toString() {
        return "User [accNo=" + accNo + ", userName=" + userName + ", balance=" + balance + ", minBalance=" + minBalance
                + ", bank=" + bank + "]";
    }

    @Override
    public void closeAccount(User user) {
        bank.deleteAccount(user);
    }
}
