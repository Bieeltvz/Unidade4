package Unidade4;
import java.util.Scanner;


public class Uni4Exe02 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("entre com um valor inteiro maior que 0: ");
    int valor = teclado.nextInt();
    if (valor % 2 == 0){
        System.out.println("Número é par");
    } else {
        System.out.println("número é impar");
    }
    String resposta = valor % 2 == 0 ? "par" : "impar";
    System.out.printf("Numero = %s", resposta);
    teclado.close();
    }
    
}
