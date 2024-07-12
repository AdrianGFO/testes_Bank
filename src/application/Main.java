package application;
import java.util.Scanner;
import entities.Program;


public class Main {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstAsk;
        Program program = new Program();

        System.out.print("Enter account number: ");
        int numberAccount = scan.nextInt();
        System.out.print("Enter account holder: ");
        scan.nextLine();
        String accountName = scan.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        firstAsk = scan.next().toLowerCase().charAt(0) + ""; //<<<<<-- usei o .charAt(0) depois do scanner pra a variavel receber apenas a primeira letra da String digitada.
                                                                    //e o toLowerCase para mesmo que o usuário digitar maiusculo ele reconhecer a resposta certa.
        if(firstAsk.equals("y")){ //usei o equals pois queria comparar e o sinal de == não estava rodando bem.
            System.out.print("Enter initial deposit value: ");
            double firstDepositValue = scan.nextDouble();
            program = new Program(numberAccount, accountName, firstDepositValue);

        } else{
            program = new Program(numberAccount, accountName);
        }


        System.out.println("\nAccount data: \n" + program.toString());

            System.out.print("\nEnter a deposit value: ");
            double depositValue = scan.nextDouble();
            program.Deposit(depositValue);

            System.out.println("Updated account data: \n" + program.toString());


            System.out.print("\nEnter a withdraw value: ");
            double withdrawValue = scan.nextDouble();
            program.Withdraw(withdrawValue);

            System.out.println("Updated account data: \n" + program.toString());



            scan.close();
    }
}