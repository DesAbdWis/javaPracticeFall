package day1;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {
        int grade = 85;

        if( grade >= 90 && grade <= 100) { // 90, 91 ..... 99
            System.out.println("You  made A, Great job");
        }

        else if( grade <90 && grade >= 80) { // 80, 81, 82...89
            System.out.println("You made B, Good");
        }

        else if(grade < 80 && grade >= 70 ) {  // 70, 71 ,... 79
            System.out.println("You made C, That's Okay");
        }

        else if ( grade <70 && grade >=60) {  // 60, 61 ,.. 69
            System.out.println("You made D, Really?");
        }
        else {
            System.out.println("You made F, Study more");
        }
    }

}
