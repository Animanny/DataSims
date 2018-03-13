package Circles;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        double sims, degree, larger;
        double ratio;
        larger = 0;
        sims = 10000000;

        for (int i = 0; i < sims; i++) {
            degree = ThreadLocalRandom.current().nextInt(0, 180 + 1);
            if (degree > 30 && degree < 150) {
                larger++;
            }
        }

        ratio = (larger / sims) * 100;
        System.out.println(ratio);
    }
}
