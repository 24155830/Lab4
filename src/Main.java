import java.util.*;

class Account {
    int ac_no;
    String ac_type;
    String name;
    double balance;
    String date;

    Account() {
        balance = 0;
    }

    void checkBalance() {
        System.out.println("Balance : " + balance);
    }

    void deposit(int amt) {
        balance = balance + amt;
        System.out.println("Balance : " + balance);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date:");
        date = sc.nextLine();
    }

    void withdraw(int amt) {}
}

class StandardAccount extends Account {
    void withdraw(int amt) {
        if (amt <= 100000) {
            balance = balance - amt;
        } else if (amt <= 500000) {
            balance = balance - amt;
            balance = balance - (0.05 * balance);
            System.out.println("Balance after fee: " + balance);
        } else {
            System.out.println("Transaction not possible");
        }
    }
}

class PremiumAccount extends Account {
    void withdraw(int amt) {
        if (amt <= 1000000) {
            balance = balance - amt;
        } else {
            System.out.println("Transaction not possible");
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Account a;

        System.out.println("Enter Account Type (StandardAccount/PremiumAccount):");
        String type = sc.nextLine();

        if (type.equals("StandardAccount")) {
            a = new StandardAccount();
        } else {
            a = new PremiumAccount();
        }

        a.ac_type = type;
        System.out.println("Enter account number:");
        a.ac_no = sc.nextInt();
        System.out.println("Enter Initial Balance:");
        a.balance = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Name:");
        a.name = sc.nextLine();

        System.out.println("Enter amount to be withdrawn:");
        int w_amt = sc.nextInt();
        a.withdraw(w_amt);

        System.out.println("Enter amount to be deposited:");
        int d_amt = sc.nextInt();
        a.deposit(d_amt);

        System.out.println("Name is " + a.name);
        a.checkBalance();
    }
}