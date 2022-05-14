import Banking.Bank;
import Banking.Human;

public class Main {
    public static void main(String[] args) {

        //creates a bank
        Bank dc = new Bank("DCbank");

        //creates humans
        Human humanDC = new Human("Deadly", "C14", 18);
        Human oldDC = new Human("Old", "DC", 8000);
        Human childDC = new Human("Child", "DC", 12);

        System.out.println(" ");
        System.out.println("OPENING BANKS TEST");
        System.out.println(" ");

        //shall succeed
        dc.openBankAccount(2500,7777, humanDC);

        //will fail cause not having enough age
        dc.openBankAccount(500, 4343, childDC);

        //will fail cause not having enough money to deposit
        dc.openBankAccount(100, 9999, oldDC);

        System.out.println(" ");
        System.out.println("WITHDRAWING MONEY TEST");
        System.out.println(" ");

        //will succeed
        dc.withdrawMoney(7777, humanDC, 200);

        //will fail cause wrong password
        dc.withdrawMoney(1234, humanDC, 200);

        //will fail cause wrong person
        dc.withdrawMoney(7777, oldDC,200);

        //will fail cause too much money being withdrawn
        dc.withdrawMoney(7777, humanDC, 3000);

        System.out.println(" ");
        System.out.println("DEPOSITING MONEY TEST");
        System.out.println(" ");

        //will succeed
        dc.depositMoney(7777, humanDC, 200);

        //will fail cause wrong password
        dc.depositMoney(1234, humanDC, 200);

        //will fail cause wrong person
        dc.depositMoney(7777, oldDC,200);

        System.out.println(" ");
        System.out.println("GETTING ACCOUNT BALANCE TEST");
        System.out.println(" ");

        //will succeed
        dc.currentBalance(7777, humanDC);

        //will fail cause wrong password
        dc.currentBalance(1234, humanDC);

        //will fail cause wrong person
        dc.currentBalance(7777, oldDC);

    }
}