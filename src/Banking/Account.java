package Banking;

public class Account {
    private int balance;
    private final int accountPass;
    private final Human humanoid;



    //constructor
    public Account(int balance, int accountPass, Human person) {
        this.balance = balance;
        this.accountPass = accountPass;
        this.humanoid = person;
    }

    //getters
    public int getBalance() {
        return balance;
    }

    public int getAccountPass() {
        return accountPass;
    }

    public boolean getAccountHolder(Human human) {
        return humanoid == human;
    }

    //method for depositing money
    public void dep(int money) {
        System.out.println("You have successfully deposited " + money + " to your account!");
        balance += money;
    }

    public void with(int money) {
        System.out.println("You have successfully withdrew " + money + " from your account!");
        balance -= money;
    }


}
