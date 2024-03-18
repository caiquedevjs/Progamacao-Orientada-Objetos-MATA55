import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char operacao = scanner.next().charAt(0);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        switch (operacao) {
            case '+':
                System.out.println("soma: " + (num1 + num2));
                break;
            case '-':
                System.out.println("subtracao: " + (num1 - num2));
                break;
            case '*':
                System.out.println("multiplicacao: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("divisao: " + (num1 / num2));
                } else {
                    System.out.println("erro: divisao por zero");
                }
                break;
            default:
                System.out.println("Operacao invalida.");
        }

        scanner.close();
    }
}
