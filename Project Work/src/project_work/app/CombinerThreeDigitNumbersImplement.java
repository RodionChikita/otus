package project_work.app;

import java.util.ArrayList;
import java.util.List;

public class CombinerThreeDigitNumbersImplement implements CombinerThreeDigitNumbers {
    @Override
    public List<Integer> threeDigitNumbers(List<Integer> digits) {
        List<Integer> threeDigitNumbers = new ArrayList<>();
        int a = (int) Math.ceil((digits.size()) / 3.0);
        for (int i = 0; i < a; i++) {
                threeDigitNumbers.add(
                        digits.get(digits.size() - 1) +
                                digits.get(digits.size() - 2) * 10 +
                                digits.get(digits.size() - 3) * 100);
                removeDigit(digits, 3);

        }
        return threeDigitNumbers;
    }

    private void removeDigit(List<Integer> digits, int iterations) {
        for (int i = 0; i < iterations; i++) {
            digits.remove(digits.size() - 1);
        }
    }
}
