import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int unit;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz = ");
        unit = inp.nextInt();

        int[] veriler = new int[unit]; // talep edilen sayı kadarlık bir dizi oluşturduk

        for (int i = 0; i < unit; i++) {
            System.out.print("SAYI GİRİNİZ = ");
            veriler[i] = inp.nextInt();
        }
        Arrays.sort(veriler); // ile diziyi küçükten büyüğe sıraladık
        int enKucuk = veriler[0];
        int enBuyuk = veriler[unit - 1];

        System.out.println("En küçük sayı: " + enKucuk);
        System.out.println("En büyük sayı: " + enBuyuk);
    }
}