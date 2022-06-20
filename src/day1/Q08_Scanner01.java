package day1;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayi giriniz :");
        int sayi1 = scan.nextInt();

        System.out.print("Ikinci sayi giriniz :");
        int sayi2 =scan.nextInt();

        int sum = sayi1 + sayi2;

        System.out.println("sum = " + sum);



    }

}
