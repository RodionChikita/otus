package project_work.tests;

import project_work.app.*;
import project_work.aseertions.Assertions;

public class SelectorEndingImplementTest {

    public void endingTest(int number, String expected) {
        String scenario = "Тест на первод числв в строку с числом " + number;
        try {
        SelectorEnding selectorEnding = new SelectorEndingImplement();
        SeparatorDigit separatorDigit = new SeparatorDigitImplement();
        String actual = selectorEnding.worldWithEnding(separatorDigit.digits(number), "рубл", "ь","я","ей");
        Assertions.assertEquals(expected, actual);
            System.out.printf("\"%s\" passed %n", scenario);

        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
