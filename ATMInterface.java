package topper;


import java.util.Scanner;

interface ATM1 {
    void checkBalance();
    void withdraw();
    void deposit();
}

class ATM2 implements ATM1 {
    private double balance;

    public ATM2(double initialBalance) {
        this.balance = initialBalance;
    }

   
    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("______Withdrawal successful______");
        }
    }

    
    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to be deposit: ");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("______Your money has been successfully deposited______\n");
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        ATM2 atmMachine = new ATM2(1000.0);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n********ATM Machine********");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.print("\nChoose the operation: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atmMachine.withdraw();
                    break;
                case 2:
                    atmMachine.deposit();
                    break;
                case 3:
                    atmMachine.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);
    }
}