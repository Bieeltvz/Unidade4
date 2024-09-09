import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com as horas de trabalho do mês: ");
        float horasMes = teclado.nextFloat();
        System.out.println("Entre com o valor pago por hora: ");
        float horasValor = teclado.nextFloat();
        double salarioTotal = horasMes * horasValor;
        if (horasMes > 160){
            double salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra; 
        }
        System.out.println("O salario total é : " + salarioTotal);

        teclado.close();
    }
    
}