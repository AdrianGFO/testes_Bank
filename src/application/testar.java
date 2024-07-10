package application;
import java.util.Scanner;

public class testar {
    public static void main(String[] args) {
        String firstAsk;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite");

        firstAsk = scan.next().charAt(0) + "";

        // System.out.println("____" + firstAsk + "____");
        if(firstAsk.equals("y") || firstAsk.equals("Y")){
            System.out.println("deu bom!");
        }else{
            System.out.println("não deu bom!");
        }

        scan.close();
    }
}
