package project_work.app;

import java.util.List;

public class ConverterNumberInStringImplement implements ConverterNumberInString {
    @Override
    public String numberInString(List<Integer> digits, WordGender wordGender) {
        int ones = digits.get(digits.size() - 1);
        int tens = digits.get(digits.size() - 2);
        int hundreds = digits.get(digits.size() - 3);
        String onesString = digitInString("один", "двы", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", ones);
        String tensString = digitInString("десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто", tens);
        String hundredsString = digitInString("сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот ", hundreds);
        if (wordGender == WordGender.WOMAN) {

            if (ones == 1) {
                onesString = "одна" + "\s";
            } else if (ones == 2) {
                onesString = "две" + "\s";

            }
        }


        if (ones + tens*10 == 11){
            onesString = "одинадцать" + "\s";
            tensString = "";
        } else if (ones + tens*10 == 12) {
            onesString = "двенадцать" + "\s";
            tensString = "";
        } else if (ones + tens*10 == 13) {
            onesString = "тринадцать" + "\s";
            tensString = "";
        } else if (ones + tens*10 == 14) {
            onesString = "четырнадцать" + "\s";
            tensString = "";
        } else if (ones + tens*10 == 15) {
            onesString = "пятнадцать" + "\s";
            tensString = "";
        } else if (ones + tens*10 == 16) {
            onesString = "шестнадцать" + "\s";
            tensString = "";
        } else if (ones + tens*10 == 17) {
            onesString = "семнадцать" + "\s";
            tensString = "";
        } else if (ones + tens*10 == 18) {
            onesString = "восемнадцать" + "\s";
            tensString = "";
        } else if (ones + tens*10 == 19) {
            onesString = "девятнадцать" + "\s";
            tensString = "";
        }


        String numberInString = hundredsString + tensString +  onesString;
        return numberInString;
    }

    private String digitInString(String one, String two, String three, String four, String five, String six, String seven, String eight, String nine, int digit) {
        String digitInString = "";
        if (digit == 0) {
            digitInString = "";
        } else if (digit == 1) {
            digitInString = one + "\s";
        } else if (digit == 2) {
            digitInString = two + "\s";
        } else if (digit == 3) {
            digitInString = three + "\s";
        } else if (digit == 4) {
            digitInString = four + "\s";
        } else if (digit == 5) {
            digitInString = five + "\s";
        } else if (digit == 6) {
            digitInString = six + "\s";
        } else if (digit == 7) {
            digitInString = seven + "\s";
        } else if (digit == 8) {
            digitInString = eight + "\s";
        } else if (digit == 9) {
            digitInString = nine + "\s";
        }
        return digitInString;
    }
}
