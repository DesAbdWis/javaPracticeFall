package recap1;

import java.util.Scanner;

public class Q06_Scanner {
    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?

        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir işçi işi kaç günde bitirmektedir: ");
        int bir_isci_bitirme_suresi = scanner.nextInt();

        System.out.print("Toplam kaç işçi çalışacak: ");
        int isci_sayisi = scanner.nextInt();

        int coklu_bitirme_suresi = bir_isci_bitirme_suresi / isci_sayisi;
        System.out.println("İşin bitme süresi: " + coklu_bitirme_suresi);


    }
}
