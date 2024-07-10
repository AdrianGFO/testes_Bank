package application;
import java.util.Scanner;
import entities.Program;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstAsk;

        System.out.print("Enter account number: ");
        int numberAccount = scan.nextInt();
        System.out.print("Enter account holder: ");
        scan.nextLine();
        String accountName = scan.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        firstAsk = scan.next().charAt(0) + ""; //<<<<<-- usei o .charAt(0) depois do scanner pra a variavel receber apenas a primeira letra da String digitada.

        if(firstAsk.equals("y") || firstAsk.equals("Y")){ //usei o equals pois queria comparar e o sinal de == não estava rodando bem.
            System.out.print("Enter initial deposit value: ");
            double firstDepositValue = scan.nextDouble();
            System.out.println("deposited");
            Program program = new Program(numberAccount, accountName, firstDepositValue);

        }
        else{
        Program program = new Program(numberAccount, accountName);
        System.out.println("Account data: " + program.toString());
        }
        System.out.println("Account data: " + program.toString());

        scan.close();
    }
}