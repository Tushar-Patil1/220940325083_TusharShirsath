import java.util.Scanner;

class BankAccount {
    int accNo;
    double balance;

    Scanner scanner = new Scanner(System.in);

    public BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
        show();
        deposit();
        withdrawl();
        show();
    }

    public void show() {
        System.out.println("Accno: " + accNo + " " + " Balance: " + balance);
    }

    public void deposit() {
        try {
            double amount;
            System.out.println("Enter amount you want to deposit");
            amount = scanner.nextDouble();
            balance = balance + amount;
            System.out.println("Total amount after deposit is: " + balance);
        } catch (Exception e) {
            System.out.println("Exception occurs: " + e);
        }
    }

    public void withdrawl() {

        try {
            double amount;
            System.out.println("Enter amount you want to withdrawl: ");
            amount = scanner.nextDouble();
            if (balance >= amount) {
                balance = balance - amount;
                System.out.println("Total balance after withdrawl is: " + balance);
            } else {
                System.out.println("Insufficient balance...exit");
            }
        } catch (Exception e) {
            System.out.println("Exception occur: " + e);
        }

    }

}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accNo = scanner.nextInt();
        System.out.println("Enter balance");
        double balance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(accNo, balance);
//        bankAccount.show();
//        bankAccount.deposit();
//        bankAccount.withdrawl();
//        bankAccount.show();
    }
}














