package project_work.app;

import java.util.ArrayList;
import java.util.List;

public class ConnectorNumberAndWordWithEndingImplement implements ConnectorNumberAndWordWithEnding {
    @Override
    public String numberAndWorldWithEnding(List<Integer> threeDigitNumbers,
                                           int numberPosition,
                                           String word,
                                           String ending1,
                                           String ending2_4,
                                           String ending5_19,
                                           WordGender wordGender) {
        try {
            int threeDigitNumber = threeDigitNumbers.get(numberPosition - 1);
            SeparatorDigit separatorDigit = new SeparatorDigitImplement();
            List<Integer> digits = new ArrayList<>();
            digits = separatorDigit.digits(threeDigitNumber);
            ConverterNumberInString converterNumberInString = new ConverterNumberInStringImplement();
            SelectorEnding selectorEnding = new SelectorEndingImplement();
            String numberAndWorldWithEnding = converterNumberInString.numberInString(digits, wordGender) + selectorEnding.worldWithEnding(digits, word, ending1, ending2_4, ending5_19);
            return numberAndWorldWithEnding;
        }catch (Exception IndexOutOfBoundsException){
            return "";
        }
    }
}
