import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in) ;
        int n1,n2,EKOK,newi;
        System.out.print("n1 değerini giriniz = ");
        n1= inp.nextInt();
        System.out.print("n2 değerini giriniz = ");
        n2=inp.nextInt();
        int i = n1;
        do{
            i--;
            if (n1%i==0 && n2%i==0){
                newi = i ;
                System.out.println("EBOB = "+ i);
                EKOK = (n1*n2)/newi ;
                System.out.println("EKOK = "+ EKOK);
                break;
            }
        }while(i!=n1) ;
    }
}