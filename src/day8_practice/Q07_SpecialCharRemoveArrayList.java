package day8_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Q07_SpecialCharRemoveArrayList {
      /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

    public static void main(String[] args) {
        // ArrayList<String> arrlist = new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
        ArrayList<String> arrlist = new ArrayList<>(Arrays.asList("$13", "$15", "$-30"));

        System.out.println("toplam : " + getSum(arrlist));
    }

    private static int getSum(ArrayList<String> arrlist) {
        int toplam = 0;
        for (String  each : arrlist) {
            String str = each.replace("$", "");

            toplam += Integer.parseInt(str); //string olan sayi degerlerini integer a cevirdik ve toplama ekledik
        }

        if(toplam<0){
            return -1; // toplam 0 dan kucuk oldugu icin method -1 dondursun dedigi icin yaptik..
        }else
            return toplam;
    }
}


