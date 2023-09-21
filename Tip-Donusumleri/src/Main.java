import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.print("Bir Tam Sayı Giriniz : ");
        int a=input.nextInt();

        System.out.print("Bir Ondalık Sayı Giriniz : ");
        double b=input.nextDouble();


        // Ondalık sayıların tam sayılara dönüşümü için aşağıdaki kodu kullanırız
        int yeniTamSayi=(int) b;
        System.out.println("Dönüşüm" +yeniTamSayi);

        //Tam sayıların ondalık sayılara dönüşümü için aşağıdaki kodu kullanırız
        double yeniOndalikSayi=(double) a;
        System.out.println("Dönüşüm" +yeniOndalikSayi);


    }
}