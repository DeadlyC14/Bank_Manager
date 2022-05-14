package Banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String bankName;
    private List<Account> accountList = new ArrayList<>();

    //booleans
    private boolean hasAccount;

    //const
    private static final int MIN_BALANCE = 200;
    private static final int MAX_WITHDRAWAL = 500;

    //constructor
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openBankAccount(int balance, int accountPass, Human person) {
        if (person.getAge() >= 18) {
            if (balance < MIN_BALANCE) {
                System.out.println("Sorry, you can't open a bank account without enough money to reach 200 dollars");
                System.out.println("Please try again later");
            } else {
                Account newAccount = new Account(balance, accountPass, person);
                accountList.add(newAccount);

                System.out.println("Successfully created bank account for " + person.getFullName());
            }
        } else {
            System.out.println("You must be at least 18 years old to open a bank account");
        }
    }

    //getters
    public String getBankName() {
        return bankName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public Account accountHolderGetter(Human person) {
        hasAccount = false;

        for (Account account : accountList) {
           if (account.getAccountHolder(person)) {
               hasAccount = true;
               return account;
           }
        }

        System.out.println("No account found");
        return null;
    }

    //money methods
    public void withdrawMoney(int pass, Human person, int money) {
        Account account = accountHolderGetter(person);

        if (hasAccount) {
            if (account.getAccountPass() == pass) {
                if (money < account.getBalance()) {
                    if (money > MAX_WITHDRAWAL) {
                        System.out.println("The max you can withdraw is 500 dollars");
                    } else {
                        account.with(money);
                    }
                } else {
                    System.out.println("You don't seem to have that much money on your bank account");
                }
            } else {
                System.out.println("Account password doesn't match this account");
            }
        }
    }

    public void depositMoney(int pass, Human person, int money) {
        Account account = accountHolderGetter(person);

        if (hasAccount) {
            if (account.getAccountPass() == pass) {
                if (money > MAX_WITHDRAWAL) {
                    System.out.println("The max you can withdraw is 500 dollars");
                } else {
                    account.with(money);
                }
            } else {
                System.out.println("Account password doesn't match this account");
            }
        }
    }

    public void currentBalance(int accountPass, Human person) {
        Account account = accountHolderGetter(person);

        if (hasAccount) {
            if (account.getAccountPass() == accountPass) {
                System.out.println(account.getBalance());
            } else {
                System.out.println("The password seems to be incorrect, please try again later");
            }
        }
    }
}
