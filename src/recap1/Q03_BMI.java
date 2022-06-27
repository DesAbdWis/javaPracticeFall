package recap1;

import java.util.Scanner;

public class Q03_BMI {


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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("kg olarak agirliginizi giriniz :");
        double agirlik = sc.nextDouble();
        System.out.print("cm olarak olarak boyunuzu giriniz :");
        double boy = sc.nextDouble();
        //boy = boy/100;
        boy/=100;

        double vke = agirlik/(boy*boy);
        System.out.println("vke = " + vke);


    }

}
