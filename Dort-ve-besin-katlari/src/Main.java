import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k;
        int toplam=0;

        System.out.print("Bir Sayı Giriniz : ");
        Scanner input=new Scanner(System.in);
        k= input.nextInt();

        for (int i=1 ; i<=k; i++){
            if (i % 4==0 || i%5 ==0){
                System.out.println(i);
            }


        }

    }
}