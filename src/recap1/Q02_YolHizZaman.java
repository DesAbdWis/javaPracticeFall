package recap1;

import java.util.Scanner;

public class Q02_YolHizZaman {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gideceğiniz yol mesafesi(km): ");
        double yol = scanner.nextDouble();

        System.out.print("Ortalama Hızınız(km/sa): ");
        double ort_hiz = scanner.nextDouble();

        double varis_suresi = yol / ort_hiz;
        System.out.print("Varış süreniz: " + varis_suresi + " saat");



    }
}
