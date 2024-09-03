package Unidade4;
import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor: ");
        int valor1 = teclado.nextInt();
        System.out.println("Entre com o segundo valor: ");
        int valor2 = teclado.nextInt();
        if (valor1 > valor2){
            System.out.println("A primeira entrada é maior.");
        } else{ 
            System.out.println("A segunda entrada é maior.");
        }
        String teste = valor1 > valor2 ? "primeira entrada é maior." : "segunda entrada é maior.";
        System.out.printf("A %s", teste);
    }
    
}
