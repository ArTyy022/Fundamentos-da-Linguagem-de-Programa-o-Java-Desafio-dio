import java.util.Scanner;

public class AtivadedeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* double base = 0;
        double altura = 0;
        double area = base * altura;
        System.out.println("A área do retângulo é: ");
    */


        System.out.println("Qual a base?");
        double base = scanner.nextDouble();
        System.out.println("Qual a altura?");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.printf("A área do retângulo é : %s ", area);
    }
}
