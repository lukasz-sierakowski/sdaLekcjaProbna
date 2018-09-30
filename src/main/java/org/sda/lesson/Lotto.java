package org.sda.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class generates random numbers.
 */
public class Lotto {

    /**
     * Generate random numbers
     *
     * @param amount Total number amount to generate
     */
    public List<Integer> generateNumbers(int amount) {
        List<Integer> result = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            int value = random.nextInt(49) + 1;
//            System.out.print(value + " ");
            result.add(value);
        }
        return result;
    }
}
