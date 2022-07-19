package day7_practice;

import java.util.Arrays;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */

    public static void main(String[] args) {
        String [][] arr = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam =0;
        for (int i = 0; i < 3; i++) { //outer for
            for (int j = 0; j < 3; j++) { //inner for
                if(arr[i][j].contains("$")){ //$ isareti iceriyorsa
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                    //parantez icindeki replaceAll methodu ile $ isaretlerinden kurtulduk, sonra elimizde "12" var(data type :String)
                    //Double toplam variable ile isleme katmak icin data casting yapmak gerekir, bu yuzden Double.parseDouble() methodunu kullandik
                    //bu asamada 12 degeri -> data type :Double oldu, eklerken de 3.2 ile carpmamizi şistedigi icin carptik
                }else{
                    toplam+=Double.parseDouble(arr[i][j].replace("€",""))*4.2;
                }
            }

        }
        System.out.println("toplam = " + toplam); //374.6

    }
}
