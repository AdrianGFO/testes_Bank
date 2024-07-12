package entities;

public class Program {
    public int accountNumber;
    public String name;
    private double balance;

    public Program(int accountNumber, String name, double firstbalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        balance = firstbalance;
    }
    public Program(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Program(){}

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String Name){
        this.name = name;
    }

    public void Deposit(double depositAmount){
    balance += depositAmount;
    }

    public void Withdraw(double WithdrawAmount){
        balance -= WithdrawAmount;
        balance -= 5;
    }

    public String toString(){
        return("Account "+this.accountNumber
        + ", Holder: " + this.name
        +String.format(", Balance: $ %.2f", balance));
    }
}
