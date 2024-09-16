import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Em que ano nasceu o primeiro filho?");
        int filho1 = teclado.nextInt();
        System.out.println("Em que ano nasceu o segundo filho?");
        int filho2 = teclado.nextInt();
        System.out.println("Em que ano nasceu o terceiro filho?");
        int filho3 = teclado.nextInt();
        if (filho1 == filho2 && filho2 == filho3){
            System.out.println("Trigemeos");
        } else  if(filho1 == filho2 || filho2 == filho3){
            System.out.println("Gemeos");
        } else {
            System.out.println("São somente irmãos");
        }
        teclado.close();
    }

    
}
