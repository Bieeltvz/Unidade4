import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com seu peso em quilogramas: ");
        double massa = teclado.nextDouble();
        System.out.println("Entre com sua altura em metros: ");
        double altura = teclado.nextDouble();
        double imc = massa / Math.pow(altura, 2);
        String classificacao = "";
        if (imc < 18.5){
            classificacao = "Magreza";
        } else if(imc <= 24.9){
            classificacao = "Saudavel";
        } else if (imc <=29.9){
            classificacao = "Sobrepeso";
        } else if (imc <= 34.9){
            classificacao = "Obesidade Grau I";
        } else if (imc <= 39.9){
            classificacao = "Obesidade Grau II(severa)";
        } else if(imc >= 40.0){
            classificacao = "Obesidade Grau III(mórbida)";
        }
        System.out.printf("Seu grau de obesidade é %s%n", classificacao);
        teclado.close();
        }       
    }
    
