import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a letra: ");
        char letra = teclado.next().toUpperCase().charAt(0);
        if(letra == 'A'|| letra == 'E'|| letra == 'I'|| letra == 'O' || letra == 'U' ){
            System.out.println("É vogal.");
        } else {
            System.out.println("Não é vogal.");
        }
        teclado.close();
    }
}
