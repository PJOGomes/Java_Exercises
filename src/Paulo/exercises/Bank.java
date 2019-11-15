package Paulo.exercises;

public class Bank {
    private int accountNumber;
    private double balance = 0;
    private String name;
    private String email;
    private int phoneNumber;

    public Bank() {
        System.out.println("Empty Constructor called");
    }

    public Bank(int accountNumber, double balance, String name, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFund(double value) {
        this.balance += value;
        System.out.println("Deposit of " + value+"€. Final balance of "+this.balance+"€.");
    }
    public void withdrawFunds (double value) {
        if(this.balance - value < 0 ){
            System.out.println("You do not have the funds to make that withdraw.");
            return;
        } else {
            this.balance -=value;
            System.out.println("Withdraw of " + value+"€. Final balance of "+this.balance+"€.");
        }
    }
}
