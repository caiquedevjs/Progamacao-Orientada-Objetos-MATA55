import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long Q = scanner.nextLong();

        long total = 0;
        long bolinhas = Q;

        for (int i = 0; i < N; i++) {
            total += bolinhas;
            bolinhas *= 2;
        }

        System.out.println(total);

        scanner.close();
    }
}

