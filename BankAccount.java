public class BankAccount {

    // Instance Variables
    private double balance; // keeps track of the amount of money a person has

    // Constructors
    public BankAccount(){ // Defult Constructor
        this.balance = 0.00;
    }
    public BankAccount(double pBalance){
        this.balance = pBalance;
    }

    // Methods
    public void setBalance(double pBalance){
        this.balance = pBalance;
    }
    public double getBalance(){
        return this.balance;
    }

}
