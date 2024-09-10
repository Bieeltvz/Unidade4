import java.util.Scanner;

public class Uni4Exe20 {
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
        double media = (prova1  + prova2 * 2 + prova3 * 3 + mediaEcercicios) / 7;
        if (media >= 9.0){
            System.out.println("Sua media é A");
            System.out.println("Aprovado");
        } else if (media >= 7.5 && media < 9.0){
            System.out.println("Sua media foi B");
            System.out.println("Aprovado");
        } else if (media >= 6.0 && media < 7.5){
            System.out.println("Sua media é C");
            System.out.println("Aprovado");
        } else if (media >= 4.0 && media < 6.0){
            System.out.println("Sua media foi D");
            System.out.println("Voce foi reprovado");
        }else if (media < 4.0){
            System.out.println("Sua media é E");
            System.out.println("Voce foi reprovado");
        }
        teclado.close();
    }
}
