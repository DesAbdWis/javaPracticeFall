package recap1;

import java.util.Scanner;

public class Q05_Scanner {
    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner oku = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("a: ");
        a = oku.nextDouble();

        System.out.print("b: ");
        b = oku.nextDouble();

        System.out.print("c: ");
        c = oku.nextDouble();

        double toplam = ((a * a) - (b * b)) / (3 * c);
        System.out.println("Sonuç: " + toplam);
    }
}
