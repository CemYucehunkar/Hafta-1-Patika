import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        int r;
        int totaln = 1, total2 = 1, total3 = 1;

        System.out.print("Elaman Sayısı Giriniz : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        System.out.print("Alt Küme Sayısını Giriniz : ");
        r = input.nextInt();


        if (r <= n) {

            for (int i = 1; i <= n; i++) {
                totaln = totaln * i;

            }
            for (int i = 1; i <= r; i++) {
                total2 = total2 * i;
            }

            for (int i = 1; i <= (n - r); i++) {
                total3 = total3 * i;
            }

            int c = totaln / (total2 * total3);
            System.out.print("C(n-r) Kombinasyonlu Alt Küme Sayısı :" + c);
        }

    }
}