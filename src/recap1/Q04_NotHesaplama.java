package recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scanner = new Scanner(System.in);

        int vize1;
        int vize2;
        int finalnot;

        System.out.print("Vize1: ");
        vize1 = scanner.nextInt();

        System.out.print("Vize2: ");
        vize2 = scanner.nextInt();

        System.out.print("Final: ");
        finalnot = scanner.nextInt();

        double sonuc = ((vize1 + vize2) / 2) * 0.3 + (finalnot * 0.7);
        System.out.print("ders notunuz: " + sonuc);
    }
}
