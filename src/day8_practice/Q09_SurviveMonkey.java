package day8_practice;

public class Q09_SurviveMonkey {
    /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/

    public static void main(String[] args) {
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;

        do {
            System.out.println("maymunlar gunde 4 muz yer");
            numberOfBananas-=4; //toplam muzdan 4 azalir
            survivalDays++;//yasadigi gun sayisini 1 arttir
            if(numberOfBananas<4){ //4 den az muz kalirsa
                monkeyAlive = false; //maymun hayatta degil
                System.out.println("bugun  "+ survivalDays + " .gun muz kalmadi, maymun sizlere omur..:( ");

            }else
                System.out.println("bugun " + survivalDays + " gun, maymun halen hayatta..:) ");

        }while(monkeyAlive);
        System.out.println("toplam yasadigi gun sayisi : " + (survivalDays-1));
    }
}
