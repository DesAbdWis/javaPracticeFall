package day1ANDday2_practice;

public class Q05_EscapeSequences {
    /*
    yazdırılamayan karakterleri karakter ve dize değişmezlerine koymak için kullanılırlar .
    Örneğin, sekme, satır başı ve geri alma gibi karakterleri bir çıkış akışına koymak için kaçış dizilerini kullanabilirsiniz.

	  \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
	          \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
	          \\: prints a back slash :\ (ters slash) yazdirir
	          \': prints single quote :' tek tirnak yazdirir.
	          \": prints double quote :"" cift tirnak yazdirir.
	 \: backslash
	 /:front slash
	 */


    public static void main(String[] args) {
        //  Soru-1 :   konsola   "Hello ", "World \ //"   seklinde yazdiriniz
        System.out.println("\"Hello \", \"World \\ //\"");

        // Soru-2 : Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdırınız.

        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");

        //Soru-3 : "Java" ile hayat cok 'afilli' yazdiriniz
        System.out.println("\"Java\" ile hayat cok \'afilli\'");

        //Soru-4 : "Zaruret" insani
        //         'kasif'  yapar   yazdiriniz
        // sonraki "TechProEd ile java cok kolay ..." ifadesi  3 satir sonra ve satir basindan 1 tab ileride yazilsin, hepsini tek kod satırı ile yazdiriniz.

        System.out.println("\"Zaruret\" insani \n\'kasif\' yapar\n\n\n\t\"TechProEd ile java cok kolay ...\"");


    }
}