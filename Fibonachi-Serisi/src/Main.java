import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int nofelements;

        System.out.print("Kaç adet Fibonacci sayısı bulmak istiyorsunuz ? ");
        nofelements = inp.nextInt();

        long[] fibonacci = new long[nofelements + 1];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= nofelements; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Fibonacci Serisi:");
        for (int i = 0; i <= nofelements; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
