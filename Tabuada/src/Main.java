import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i <= 100; i++) {
            System.out.println(N * i);
        }

        scanner.close();
    }
}