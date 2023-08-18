package project_work.app;

import java.util.ArrayList;
import java.util.List;

public class PrinterConsole implements Printer{
    @Override
    public void print(int inputData) {
        SeparatorDigit separatorDigit = new SeparatorDigitImplement();
        CombinerThreeDigitNumbers combinerThreeDigitNumbers = new CombinerThreeDigitNumbersImplement();
        ConnectorNumberAndWordWithEnding connectorNumberAndWordWithEnding = new ConnectorNumberAndWordWithEndingImplement();
        List<Integer> threeDigitNumbers = new ArrayList<>();
        threeDigitNumbers = combinerThreeDigitNumbers.threeDigitNumbers(separatorDigit.digits(inputData));
        String result = connectorNumberAndWordWithEnding.numberAndWorldWithEnding(threeDigitNumbers, 3, "миллион", "", "а", "ов", WordGender.MAN) +
                        connectorNumberAndWordWithEnding.numberAndWorldWithEnding(threeDigitNumbers, 2, "тысяч", "а", "и", "", WordGender.WOMAN)+
                        connectorNumberAndWordWithEnding.numberAndWorldWithEnding(threeDigitNumbers, 1, "рубл", "ь", "я", "ей", WordGender.MAN);
        if (inputData == 0){
            result = "ноль рублей";
        }
        System.out.println(result);
    }
}
