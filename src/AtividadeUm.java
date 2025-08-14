import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = scanner.next();
        System.out.println("Qual o ano que você nasceu?");
        int anoDeNascimento = scanner.nextInt();
        int anoAtual = 2025;
        int ano = anoAtual - anoDeNascimento;
        System.out.println("Olá " + nome + " Sua idade é " + ano);

        }
    }
