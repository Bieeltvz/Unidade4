package Unidade4;

public class ExemploCase {
    public static void main(String[] args) {
        int numero = 2;
        switch(numero){
            case 1:
            case 2:
            case 3:
            System.out.println("digitou algo entre UM e TRES");
            break;
            default:
            System.out.println("digitou algo diferente do pedido");
            break;
        }

    }
    
}
