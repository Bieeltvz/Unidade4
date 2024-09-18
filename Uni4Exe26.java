package Unidade4;

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("T:calcular a area de um triangulo de base b e altura h.");
        System.out.println("Q:calcular a area de um quadrado de lado I");
        System.out.println("R:calcular a area de um retangulo de base b e altura");
        System.out.println("C:calcular a area de um circulo de raio r");
        char opcao = Character.toUpperCase(teclado.next().charAt(0));
        //teclado.next().toUpperCase().charAt(0);
        if(opcao == 'T'){
            System.out.println("Digite a base e a altura do triangulo");
            double base = teclado.nextDouble();
            double altura = teclado.nextDouble();
            System.out.println("Area do triangulo =  " + base * altura / 2);
        } else if (opcao == 'Q'){
            System.out.println("Digite o lado");
            double lado = teclado.nextDouble();
            System.out.println("Area do quadrado = " + lado * lado);
        } else if(opcao == 'R'){
            System.out.println("Digite a base e a altura do retangulo");
            double b = teclado.nextDouble();
            double h = teclado.nextDouble();
            System.out.println("Area do retangulo = " + b * h);
        } else if(opcao == 'C'){
            System.out.println("Digite o raio: ");
            double raio = teclado.nextDouble();
            System.out.println("Area do circulo: " + Math.PI * Math.pow(raio, 2));
        } else {
            System.out.println("Opção invalida");
    }
    teclado.close();
    }
}