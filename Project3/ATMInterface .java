import java.util.Scanner;

public class ATMInterface {

    static double balance = 10000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose Option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    balance += sc.nextDouble();
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    if (amount <= balance)
                        balance -= amount;
                    else
                        System.out.println("Insufficient Balance");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
