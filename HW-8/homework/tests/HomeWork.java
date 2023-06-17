package homework.tests;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше
        Написать тесты (минимум 4) на классы homework.app.DiceImpl и homework.app.Game.
        Тесты должны найти не менее двух ошибок.
        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        new DiceImplTest().testDiceImplOnNumberOfPoints();
        new GameTest1().testGameWithNoWinner();
        new GameTest2().testGameWithWinnerPlayer1();
        new GameTest3().testGameWithWinnerPlayer2();

    }

}