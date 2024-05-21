package hw6_0;

public class task1_credit_card {
    private int id;
    private String accountNumber;
    private double currentBalance;

    public task1_credit_card(int id, String accountNumber, double currentBalance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
    public void deposit(double depositAmount){
        currentBalance += depositAmount;
        System.out.println("Current balance after deposit: " + currentBalance);
    }

    public void withdraw(double amount) {
        if (amount > this.currentBalance) {
            System.out.println("Error: Insufficient balance for account number " + this.accountNumber + " with id " + this.id);
        } else {
            this.currentBalance -= amount;
            System.out.println("Withdrawal successful for account number " + this.accountNumber + " with id " + this.id);
        }
    }
    public void cardInfo(){
        System.out.println("Account number: " + accountNumber + " with id " + id + " has a balance of " + currentBalance);
    }
}
