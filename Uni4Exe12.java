package Unidade4;

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o comprimento do lado 1: ");
        double lado1 = teclado.nextDouble();
        System.out.println("Entre com o comprimento do lado 2: ");
        double lado2 = teclado.nextDouble();
        System.out.println("Entre com o comprimento do lado 3: ");
        double lado3 = teclado.nextDouble();
            if (lado1 < (lado2 + lado3) &&
                    lado2 < (lado1 + lado3) &&
                    lado3 < (lado1 + lado2)) {
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.println("é equilatero.");
                } else if (lado1 == lado2 ||
                        lado2 == lado3 ||
                        lado1 == lado3) {
                    System.out.println("é isósceles");
                } else {
                    System.out.println("É escaleno");
                }
            }else {
                System.out.println("Não é um triangulo.");
            teclado.close();
        } 


        }
    }
    

