package recap1;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char finalNotu = 'B';

        // String result ="";

        String result = (finalNotu == 'A') ? "Gayet Basarili" :
                (finalNotu == 'B') ? "Basarili" :
                        (finalNotu == 'C') ? "Ha gayret" : "Digerleri..";

        System.out.println("result = " + result);


    }
}
