import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = entrada.nextInt();

        int produto = numero1 * numero2;

        System.out.println("O produto dos dois números é: " + produto);

        entrada.close();
    }
}