package org.sda.lesson;

import java.util.List;

public class LottoMain {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        List<Integer> numbers = lotto.generateNumbers(8);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
