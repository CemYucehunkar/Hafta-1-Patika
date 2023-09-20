import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;
        System.out.print("Bir Sayı Giriniz : ");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        double toplam=0;

        for(double i=1; i<=n ;i++){
            toplam += (1/i);

        }
        System.out.print(toplam);

    }
}