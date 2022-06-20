package day1;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers

	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals

	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);

        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);

        short shortMax = Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);

        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);

        int intMin = Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);

        int intMax = Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);

        long longMin = Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);

        //long, double, float veri tiplerinin max ve min degerlerini yazdiralim.


        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float  laptopFiyat = 9999.99F;
        double kilometre =579.6;
        char cinsiyet = 'E';
        boolean dogruMu =true;

    //   System.out.println(laptopFiyat);
    //   System.out.println("laptopFiyat = " + laptopFiyat); //soutv yazinca bu sekilde cikiyor
    //   System.out.println(kilometre);
    //   System.out.println(cinsiyet);
    //   System.out.println(dogruMu);
        /*
        coklu yorum satiri
         */

        System.out.println(laptopFiyat +"," + kilometre + "," + cinsiyet + "," + dogruMu);

    }

}
