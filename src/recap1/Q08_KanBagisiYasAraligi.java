package recap1;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {

    public static void main(String[] args) {
		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */


        Scanner sc = new Scanner(System.in);

        System.out.print("Luften yasinizi giriniz : ");
        int yas = sc.nextInt();
        System.out.print("lütfen kilonuzu giriniz : ");
        int kilo = sc.nextInt();


        if (yas > 0 && yas < 18) {
            System.out.println("Yaşı 18 den küçük olanlar  kan bağışı yapamaz");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {
                System.out.println("Kilonuz 50 den küçük olduğu için kan bağışı yapamazsınız");
            } else if (kilo >= 50) {
                System.out.println("Kan bağışı yapabilirsiniz");
            } else {
                System.out.println("Yalnış bir değer girdiniz");
            }
        } else {
            System.out.println("Yalnış bir değer girdiniz");
        }

    }
}