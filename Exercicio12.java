//Frank Rocha

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = entrada.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        double raizQuadrada = Math.sqrt(numero);
        double potencia10 = Math.pow(numero, 10);

        System.out.printf("O número elevado ao quadrado é: %.1f%n", quadrado);
        System.out.printf("O número elevado ao cubo é: %.1f%n", cubo);
        System.out.printf("A raiz quadrada do número é: %.1f%n", raizQuadrada);
        System.out.printf("O número elevado a potência 10 é: %.1f%n", potencia10);

        entrada.close();
    }
}
