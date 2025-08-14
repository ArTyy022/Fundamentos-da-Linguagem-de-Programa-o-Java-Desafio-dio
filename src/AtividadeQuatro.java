import java.util.Scanner;

public class AtividadeQuatro {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro nome:");
        String nome1 = scanner.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = scanner.next();
        System.out.println("Digite a primeira idade");
        int idade1 = scanner.nextInt();
        System.out.println("Digite a segunda idade");
        int idade2 = scanner.nextInt();

        int idadeDiferenca = idade1 - idade2;
        System.out.println("A diferença de idade de " + nome1 + " e " + nome2 + " é " + idadeDiferenca);


    }
}



