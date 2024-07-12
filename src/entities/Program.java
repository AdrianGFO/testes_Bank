package entities;

public class Program {
    public int accountNumber; // mudar depois o modificador de acesso.
    public String name;
    private double balance;

    public Program(int accountNumber, String name, double firstbalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        Deposit(firstbalance);
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

    public void Deposit(double depositAmount){
    balance += depositAmount;
    }

    public void Withdraw(double WithdrawAmount){
        if(WithdrawAmount <= (balance - 5)) {
            balance -= WithdrawAmount;
            balance -= 5;
        }else{
            System.out.println("Saldo Insuficiente, considere o valor da taxa de saque.");
        }
    }

    public String toString(){
        return("Account "+this.accountNumber
        + ", Holder: " + this.name
        +String.format(", Balance: $ %.2f", balance));
    }
}
