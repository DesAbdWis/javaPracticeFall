package day1;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen  Y/N ikilisinden birisini giriniz=");
        char karakter= scan.next().charAt(0);

        if(karakter == 'Y' || karakter == 'y'){
            System.out.println("YES");
        }else if(karakter == 'N' || karakter == 'n'){
            System.out.println("NO");
        }else{
            System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
        }

        scan.close();
    }
}
