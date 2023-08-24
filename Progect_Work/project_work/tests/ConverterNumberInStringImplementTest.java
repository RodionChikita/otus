package project_work.tests;

import project_work.app.*;
import project_work.aseertions.Assertions;

public class ConverterNumberInStringImplementTest {
    public void converterTest(int number, String expected) {
        String scenario = "Тест на выбор окончания с числом " + number;
        try {
            ConverterNumberInString converterNumberInString = new ConverterNumberInStringImplement();
            SeparatorDigit separatorDigit = new SeparatorDigitImplement();
            String actual = converterNumberInString.numberInString(separatorDigit.digits(number), WordGender.MAN);
            Assertions.assertEquals(expected, actual);
            System.out.printf("\"%s\" passed %n", scenario);

        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
