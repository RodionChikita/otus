package homework.tests;

import homework.app.Game;
import homework.app.Player;
import homework.assertions.Assertions;
import homework.tests.fakes.DiceImplFake2;
import homework.tests.fakes.GameWinnerConsolePrinterFake;

import java.util.ArrayList;

public class GameTest2 {
    private final DiceImplFake2 dice = new DiceImplFake2();
    private final ArrayList<String> actualFlow = new ArrayList<>();
    private final GameWinnerConsolePrinterFake winnerPrinter = new GameWinnerConsolePrinterFake(actualFlow) ;
    private final Game game = new Game(dice, winnerPrinter);


    public void testGameWithWinnerPlayer1 () {
        String scenario = "Тест победил первый игрок";
        try {
            game.playGame(new Player("Player1"), new Player("Player2"));
            Assertions.assertEquals("Player1", actualFlow.get(0));

            System.out.printf("\"%s\" passed %n", scenario);

        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
