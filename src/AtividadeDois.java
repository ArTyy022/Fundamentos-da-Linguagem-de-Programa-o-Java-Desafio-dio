import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* double lado1 = 6;
        double lado2 = 6;
        double area = lado1 * lado2;
        System.out.println("A área do quadrado é: " + area);
    */

        System.out.println("Qual o tamanho do do primeiro lado");
        double lado1 = scanner.nextDouble();
        System.out.println("Qual o tamanho do segundo lado");
        double lado2 = scanner.nextDouble();
        double area = lado1 * lado2;
        System.out.printf("A área do quadrado é : %s ", area);
    }
}
