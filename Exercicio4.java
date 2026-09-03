

//Frank Rocha

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = entrada.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int numero3 = entrada.nextInt();

        System.out.println("Digite o quarto número inteiro:");
        int numero4 = entrada.nextInt();

        int produto = (numero1 + numero2 + numero3 + numero4);

        System.out.println("A soma dos números é: " + produto);

        entrada.close();

    }  

}   
