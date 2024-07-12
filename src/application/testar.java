package application;
import java.util.Scanner;

public class testar {
    public static void main(String[] args) {
int result;
String pergunta;

Scanner sc = new Scanner(System.in);
        System.out.println("Digite algo maiusculo");
        pergunta = sc.next().toLowerCase();

        if(pergunta.equals("y")){
            System.out.println("deu certo" + pergunta);
        }else{
            System.out.println("deu errado" + pergunta);
        }
        //System.out.println(result);
    sc.close();
    }
}
