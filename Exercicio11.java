import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = entrada.nextInt();

        System.out.println("Digite o ano atual:");
        int anoAtual = entrada.nextInt();

        int idade = anoAtual - anoNascimento;
        int idadeEm2030 = 2030 - anoNascimento;

        System.out.println("A idade dessa pessoa é: " + idade + " anos");
        System.out.println("Em 2030, ela terá: " + idadeEm2030 + " anos");

        entrada.close();
    }
}