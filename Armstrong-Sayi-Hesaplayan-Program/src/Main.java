
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int toplam = 0;

        System.out.print("Bir Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        while (number != 0) {
           toplam +=number %10;
           number /=10;
        }
        System.out.println(toplam);


    }
}