import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a idade do Marquinhos?");
        int idadeMarquinhos = teclado.nextInt();
        System.out.println("Qual a idade do Zezinho?");
        int idadeZezinho = teclado.nextInt();
        System.out.println("Qual a idade da Luluzinha?");
        int idadeLuluzinha = teclado.nextInt();
        if(idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha){
            System.out.println("O Marquinhos é o caçula.");
        } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            System.out.println("O Zezinho é o caçula.");
        }  else {
            System.out.println("A Luluzinha é a caçula.");
        }
        teclado.close();
    }
}
