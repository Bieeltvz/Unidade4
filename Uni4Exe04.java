package Unidade4;
import java.util.Scanner;


public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("De seu numero");
        double num = teclado.nextDouble();
        if (num - (int) num != 0){
            System.out.println("O numero possui casas decimais.");
        } else {
            System.out.println("O numero não possui casas decimais.");
        }
        
        if (num % 1 != 0){
            System.out.println("O numero possui casas decimais.");
        } else {
            System.out.println("O numero não possui casas decimais.");
        }


    }
    
}
