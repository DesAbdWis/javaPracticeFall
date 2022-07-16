package day6_practice;

public class Q07_Arrays {

    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
     * yazdiran bir method yaziniz
     * int[] arr= {5,7,-6,4,2,15,3,8,1};
     * int istenenToplam=9;
     */

    public static void main(String[] args) {
        int arr[] = {5,7,-6,4,2,15,3,8,1};
        int istenenToplam = 9;
        arrMethod(arr,istenenToplam);

    }

    private static void arrMethod(int[] arr, int istenenToplam) {

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] + arr[j]==9 ){
                    System.out.println(arr[i] +" ve " + arr[j] + " toplam :"+ istenenToplam);
                }
            }

        }
    }
}
 /*
        j=i+1 ve j=i:   5 ve 4 toplam :9
                        7 ve 2 toplam :9
                        -6 ve 15 toplam :9
                        8 ve 1 toplam :9


        j=0;    5 ve 4 toplam :9
                7 ve 2 toplam :9
                -6 ve 15 toplam :9
                4 ve 5 toplam :9
                2 ve 7 toplam :9
                15 ve -6 toplam :9
                8 ve 1 toplam :9
                1 ve 8 toplam :9
         */