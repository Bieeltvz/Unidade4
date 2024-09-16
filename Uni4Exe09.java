import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor:");
        int valor1 = teclado.nextInt();
        System.out.println("Entre com o segundo valor:");
        int valor2 = teclado.nextInt();
        // Quando você usa o operador %, ele retorna o resto da divisão do primeiro operando pelo segundo.
        if(valor1 %  valor2 == 0|| valor2 % valor1 == 0 ){
            System.out.println("Os numeros são multiplos");
        }   else {
            System.out.println("Os numeros não sao multiplos");
        }
        teclado.close();
    }
}
