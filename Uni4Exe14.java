import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = teclado.nextInt();
        System.out.println("Digite o mês: ");
        int mes = teclado.nextInt();
        System.out.println("Digite o ano: ");
        int ano = teclado.nextInt();
        if(dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0){
            if(mes == 1 || mes == 3 || mes ==  4 || mes == 5 || mes == 7 || mes == 8 || mes == 9 || mes == 10 || mes == 11 || mes == 12){
                System.out.println("Valida.");
            }else if(mes != 2 && dia < 31){
                System.out.println("Valida.");
            } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)){
                System.out.println("Valida");
            }
        } else {
            System.out.println("Não valida.");
        }
        teclado.close();
    }
    
}
//nome.equals(x); se nome for igual a X retorna true, se nao retorna false

