package Circles;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        double sims, degree, larger;
        double ratio;
        //Variable holding total times the chord is longer
        larger = 0;
        //How many simulations that will be run
        sims = 10000000;

        for (int i = 0; i < sims; i++) {
            //Generate the degree between the tangent and the chord
            degree = ThreadLocalRandom.current().nextInt(0, 180 + 1);
            //Determine if the chord is larger than the radius
            if (degree > 30 && degree < 150) {
                //If the degree is between the bounds, increment the tally
                larger++;
            }
        }
        //Find the percentage probability
        ratio = (larger / sims) * 100;
        //Print the probability the length is larger than the radius
        System.out.println(ratio);
    }
}
