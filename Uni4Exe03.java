import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor: ");
        int valor1 = teclado.nextInt();
        System.out.println("Entre com o segundo valor: ");
        int valor2 = teclado.nextInt();
        if (valor1 > valor2) {
            System.out.println("O maior é: " + valor1);
        } else {
            System.out.println("O maior é: " + valor2);
        }

        if (valor1 == valor2) {
            System.out.println("São iguais: " + valor1);
        } else if (valor1 > valor2) {
            System.out.println("O maior é: " + valor1);
        } else {
            System.out.println("O maior é: " + valor2);

        }

        System.out.println("--------------------------------");

        if (valor1 == valor2) {
            System.out.println("São iguais: " + valor1);
        } else {
            if (valor1 > valor2) {
                System.out.println("O maior é: " + valor1);
            } else {
                System.out.println("O maior é: " + valor2);
            }
        }
        System.out.println("O maior é: " + (valor1 == valor2 ? "iguais " + valor1 : valor1 > valor2 ? valor1 : valor2));
        teclado.close();
    }

}