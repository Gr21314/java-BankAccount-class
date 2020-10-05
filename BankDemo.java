// Import Scanner Class
import java.util.Scanner;
public class BankDemo {

    public static void main(String[] args) {
        // Initialize Scanner Object
        Scanner input = new Scanner(System.in);
        // Initialize BankAccount Object
        BankAccount john = new BankAccount(200.00);
        System.out.println(john.getBalance());
        john.setBalance(5000.00);
        System.out.println(john.getBalance());

        // System.out.println("Please enter beginning balance: ")

    }
}
