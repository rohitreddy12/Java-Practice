package BankingApplication;

public class BankApp {
    public static void main(String[] args) {
        User u1 = new User(1, "rohit12", 500,0);
        u1.depositMoney(100);
        u1.withDrawMoney(900);
    }
}
