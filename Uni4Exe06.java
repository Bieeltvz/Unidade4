package Unidade4;
import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite M, F ou I");
        String sexo = teclado.nextLine().toUpperCase();//teclado.next().toUpperCase().charAt(0); // toUpperCase pra caso se o usuario digitar letra minuscula O comando charAt(0) é usado em combinação com o comando next() simples , que instrui o Java a registrar o próximo caractere ou string inserido na linha de comando.
        if (sexo.equals("M")){
            System.out.println("Masculino");//Em Java, a comparação de strings deve ser feita com o método .equals() em vez do operador ==.
        } else if (sexo.equals("F")){
            System.out.println("Feminino");
        } else if (sexo.equals("I")){
            System.out.println("Não informado");
        } else {
            System.out.println("Responda somente com M, F OU I");
        }
        teclado.close();
    }


}