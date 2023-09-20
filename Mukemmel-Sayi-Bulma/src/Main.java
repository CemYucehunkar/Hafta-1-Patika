import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int value, valuetotal = 0 ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir değer giriniz =");
        value=inp.nextInt();
        for(int i = 1 ; i<value ; i++) {
            if ( value%i == 0){
                valuetotal += i ;
            }
        }if (value==valuetotal ) {
            System.out.println(value + " Mükemmel bir sayıdır");
        }else {
            System.out.println(value + " Mükemmel sayı değildir.");
        }
    }
}
