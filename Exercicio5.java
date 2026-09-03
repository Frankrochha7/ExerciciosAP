
//Frank Rocha

import java.util.Scanner;


public class Exercicio5 {
    
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

       System.out.println("Digite a primeira nota:");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = entrada.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        System.out.printf("A média das notas é: %.1f%n", media);

        entrada.close();
}

}
