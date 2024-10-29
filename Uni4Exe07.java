import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Entre com peso da carta: ");
        double pesoCarta = teclado.nextDouble();
        double valorPagar = 0;
        if(pesoCarta >= 50 ){
            double pesoExedido = pesoCarta - 50;
            double pesoAdicional = (pesoExedido / 20) + 1;
            valorPagar = 0.45 + 0.45 * pesoAdicional;
            System.out.println("Custo do selo: " + df.format(valorPagar));
        } else {
            valorPagar = 0.45;
        }
        System.out.println("Custo do selo " + df.format(valorPagar));
        teclado.close();
    }
    
}