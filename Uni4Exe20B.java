import java.util.Scanner;

public class Uni4Exe20B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com a nota da primeira prova: ");
        double prova1 = teclado.nextDouble();
        System.out.println("Entre com a nota da segunda prova: ");
        double prova2 = teclado.nextDouble();
        System.out.println("Entre com a nota da terceira prova: ");
        double prova3 = teclado.nextDouble();
        System.out.println("Qual foi a media dos exercicios?");
        double mediaEcercicios = teclado.nextDouble();
        double media = (prova1 + (prova2 * 2) + (prova3 * 3) + mediaEcercicios) / 7;
        char conceito = ' ';
        if (media >= 9.0) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9.0) {
          conceito = 'B';
        } else if (media >= 6.0 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4.0 && media < 6.0) {
           conceito = 'D';
        } else if (media < 4.0) {
            conceito = 'E';
        } 
        System.out.printf("A média é %.3f com conceito %c.%n", media, conceito);
        if (conceito =='A' || conceito == 'B' || conceito == 'C'){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
        teclado.close();
    }
}