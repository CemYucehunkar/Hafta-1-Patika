import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int namount, amount, select, purse = 1500, right = 3;
        String userName, password;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Kullanıcı adı :");
            userName = inp.nextLine();
            System.out.print("Şifre :");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("pat123")) {
                System.out.print("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ = ");
                do {
                    System.out.print("\n1 - Para çekme\n" +
                            "2 - Para yatırma\n" +
                            "3 - Bakiye sorgulama\n" +
                            "4 - ÇIKIŞ \n" +
                            "Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Çekmek istediğiniz tutarı giriniz =");
                            namount = inp.nextInt();
                            if (purse < namount) {
                                System.out.print("YETERSİZ BAKİYE");
                            } else {
                                purse -= namount;
                                System.out.print("Kalan bakiyeniz =" + purse);
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz =");
                            amount = inp.nextInt();
                            purse += amount;
                            System.out.print("Güncel bakiyeniz = " + purse);
                            break;
                        case 3:
                            System.out.print("Bakiyeniz =" + purse);
                            break;
                    }
                } while (select != 4);
                System.out.print("ÇIKIŞ YAPILMIŞTIR");
                return;
            } else {
                System.out.println("Kullanıcı adı ve şifre yanlış !!");
                right -= 1;
                System.out.println("Kalan deneme hakkınız =" + right);
            }
        } while (right != 0);
        System.out.print("Görüşürüz");
    }
}