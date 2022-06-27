package recap1;

import java.util.Scanner;

public class Q03_BMI {

    public static void main(String[] args) {
		/*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan = new Scanner(System.in);
        System.out.print("kg olarak vucut agirliginiz = ");

        double agirlik = scan.nextDouble();
        System.out.print("cm olarak boy uzunlugunuz = ");

        double uzunluk = scan.nextDouble();

        uzunluk = uzunluk / 100;  //uzunluk/=100

        double vke = agirlik / (uzunluk * uzunluk);

        System.out.println("vucut kitle indeksi (VKI)= " + vke);


        scan.close();
    }
}
