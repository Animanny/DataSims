package SamuraiChamploo;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        //Variable holding total fights that occur
        double fights = 0;
        //The total amount of sims to run
        double sims = 1000000;

        for (int j = 0; j < sims; j++) {
            //Select fighter 1's arrival minute
            int fighter1 = ThreadLocalRandom.current().nextInt(0, 60 + 1);
            //Select fighter 2's arrival minute
            int fighter2 = ThreadLocalRandom.current().nextInt(0, 60 + 1);
            //Find the Difference between the two fighter's arrival time
            int difference = Math.max(fighter1,fighter2) - Math.min(fighter1,fighter2);

            //If this difference is less than or equal to 5, increment the fights
            if (difference <= 5){
                fights++;
            }
        }
        //Find the Ratio
        double ratio = (fights/sims)*100;
        //Print the rate at which fights occur
        System.out.println(ratio+"%");
    }
}
