package day4_practice;

import java.util.Scanner;

public class Q02_MethodCreation {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("metre ve km ye donusturmek istediginiz cm degeriniz girinzi :");
        double santiMeterValue = scan.nextDouble();

        convertSM(santiMeterValue);

    }

    private static void convertSM(double santiMeterValue) {
        double meter = santiMeterValue/100;
        double kMeter =santiMeterValue/100000;
        System.out.println("girdiginiz santimetre degeri :" +santiMeterValue +" :" + meter + " m dir, " + kMeter + " km dir");

    }
}
