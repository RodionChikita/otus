package project_work.tests;


public class Tests {
    public static void main(String[] args) {
        SelectorEndingImplementTest selectorEndingImplementTest = new SelectorEndingImplementTest();
        ConverterNumberInStringImplementTest converterNumberInStringImplementTest = new ConverterNumberInStringImplementTest();
        selectorEndingImplementTest.endingTest(1, "рубль ");
        selectorEndingImplementTest.endingTest(2, "рубля ");
        selectorEndingImplementTest.endingTest(5, "рублей ");
        selectorEndingImplementTest.endingTest(11, "рублей ");
        selectorEndingImplementTest.endingTest(12, "рублей ");
        selectorEndingImplementTest.endingTest(15, "рублей ");
        selectorEndingImplementTest.endingTest(20, "рублей ");
        selectorEndingImplementTest.endingTest(21, "рубль ");
        selectorEndingImplementTest.endingTest(23, "рубля ");
        selectorEndingImplementTest.endingTest(25, "рублей ");
        selectorEndingImplementTest.endingTest(30, "рублей ");
        selectorEndingImplementTest.endingTest(100, "рублей ");
        selectorEndingImplementTest.endingTest(101, "рубль ");
        selectorEndingImplementTest.endingTest(102, "рубля ");
        selectorEndingImplementTest.endingTest(105, "рублей ");
        selectorEndingImplementTest.endingTest(110, "рублей ");
        selectorEndingImplementTest.endingTest(111, "рублей ");
        selectorEndingImplementTest.endingTest(112, "рублей ");
        selectorEndingImplementTest.endingTest(115, "рублей ");
        selectorEndingImplementTest.endingTest(120, "рублей ");
        selectorEndingImplementTest.endingTest(121, "рубль ");
        selectorEndingImplementTest.endingTest(122, "рубля ");
        selectorEndingImplementTest.endingTest(125, "рублей ");

        converterNumberInStringImplementTest.converterTest(1, "один ");
        converterNumberInStringImplementTest.converterTest(2, "два ");
        converterNumberInStringImplementTest.converterTest(5, "пять ");
        converterNumberInStringImplementTest.converterTest(11, "одинадцать ");
        converterNumberInStringImplementTest.converterTest(12, "двенадцать ");
        converterNumberInStringImplementTest.converterTest(15, "пятнадцать ");
        converterNumberInStringImplementTest.converterTest(20, "двадцать ");
        converterNumberInStringImplementTest.converterTest(21, "двадцать один ");
        converterNumberInStringImplementTest.converterTest(23, "двадцать три ");
        converterNumberInStringImplementTest.converterTest(25, "двадцать пять ");
        converterNumberInStringImplementTest.converterTest(30, "тридцать ");
        converterNumberInStringImplementTest.converterTest(100, "сто ");
        converterNumberInStringImplementTest.converterTest(101, "сто один ");
        converterNumberInStringImplementTest.converterTest(102, "сто два ");
        converterNumberInStringImplementTest.converterTest(105, "сто пять ");
        converterNumberInStringImplementTest.converterTest(110, "сто десять ");
        converterNumberInStringImplementTest.converterTest(111, "сто одинадцать ");
        converterNumberInStringImplementTest.converterTest(112, "сто двенадцать ");
        converterNumberInStringImplementTest.converterTest(115, "сто пятнадцать ");
        converterNumberInStringImplementTest.converterTest(120, "сто двадцать ");
        converterNumberInStringImplementTest.converterTest(121, "сто двадцать один ");
        converterNumberInStringImplementTest.converterTest(122, "сто двадцать два ");
        converterNumberInStringImplementTest.converterTest(125, "сто двадцать пять ");
    }
}
