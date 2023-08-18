package project_work.app;

import java.util.ArrayList;
import java.util.List;

public class SeparatorDigitImplement implements SeparatorDigit {
    @Override
    public List<Integer> digits(int inputData) {
        String inputDataString = Integer.toString(inputData);
        char[] characters = inputDataString.toCharArray();
        List<Integer> digits = new ArrayList<>();
        for (char character : characters) {
            digits.add(Character.getNumericValue(character));
        }
        for (int i = 0; i < digits.size() % 3; i++) {
            digits.add(0, 0);
        }
        return digits;
    }
}
