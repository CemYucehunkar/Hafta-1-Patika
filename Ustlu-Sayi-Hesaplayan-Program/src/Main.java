import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k,n;
        int total=1;

        System.out.print("Üssü Alınacak Sayıyı Giriniz : ");
        Scanner input=new Scanner(System.in);
        k=input.nextInt();

        System.out.print("Üs Olacak Sayıyı Giriniz : ");
        n=input.nextInt();

        for (int i=1; i<=n ; i++){
            total*=k;

        }
        System.out.print("Sonuç : " +total);

    }
}