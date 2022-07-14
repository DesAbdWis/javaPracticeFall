package day5_practice;

import java.util.Scanner;

public class Q01_ForLoop {

     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */
     public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
         System.out.println("lutfen bir harf giriniz :");
         String harf = scanner.next().toLowerCase();

         String sesliHarfler = "aeiou";
         String sessizHarfler = "bcdfghjklmnpqrstxvwyz";

         if(harf.length()==1){
             for (int i = 0; i < sesliHarfler.length() ; i++) {
                 if(sesliHarfler.contains(harf)){
                     System.out.println("sesli harf");
                     break;
                 }else if(sessizHarfler.contains(harf)){
                     System.out.println("sessiz harf");
                     break;
                 }else {
                     System.out.println("yanlis karakter girdiniz");
                     break;
                 }

             }
         }else System.out.println("tek karakter giriniz");


     }

}
