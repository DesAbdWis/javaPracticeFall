package day6_practice;

import java.util.Arrays;

public class Q06_Arrays {

    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */

    public static void main(String[] args) {
        String str = "HeySiri";
        str= str.replace("Hey","Bye");
        System.out.println("str = " + str);
        String [] arr = new String [1];
        arr[0] = str;
        System.out.println(Arrays.toString(arr));
    }
}
