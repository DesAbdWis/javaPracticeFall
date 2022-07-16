package day6_practice;

public class Q09_Arrays {

    /*
     * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
     * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

     */

    public static void main(String[] args) {
        int arr1 [] [] = { {0,2,-1}, {3,8,9}, {7} };
        int arr2 [] [] = { {-7,6,-9}, {0,12}, {19} };

        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum1 +=arr1[i][j];
            }

        }
        System.out.println("sum1 = " + sum1);


        int sum2 = 0;
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum2 += arr2[i][j];
            }
        }
        System.out.println("sum2 = " + sum2);

        System.out.println("arr1 + arr2 nin elemanlari toplami : " + (sum1 + sum2));
    }
}
