package day1;

public class Q02_Println_vs_print {
  /*
  println() ve print() arasinda tek fark var;
  println satir atliyor,
  print ise imlecin ayni satirda kalmasini sagliyor.

   */

    public static void main(String[] args) {
        System.out.println("****println****");
        System.out.println("welcome");
        System.out.println("java");
        System.out.println("practice");

        System.out.println("****print****");
        System.out.print("welcome");
        System.out.print(" java");
        System.out.print(" class");
    }


}
