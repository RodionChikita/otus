package homework.tests;

import homework.app.Game;
import homework.app.Player;
import homework.assertions.Assertions;
import homework.tests.fakes.DiceImplFake1;
import homework.tests.fakes.GameWinnerConsolePrinterFake;

import java.util.ArrayList;

public class GameTest1 {
    private final DiceImplFake1 dice = new DiceImplFake1();
    private final ArrayList<String> actualFlow = new ArrayList<>();
    private final GameWinnerConsolePrinterFake winnerPrinter = new GameWinnerConsolePrinterFake(actualFlow) ;
    private final Game game = new Game(dice, winnerPrinter);


        public void testGameWithNoWinner () {
            String scenario = "Тест на ничью";
            try {
                game.playGame(new Player("Player1"), new Player("Player2"));
                Assertions.assertEquals("Ничья", actualFlow.get(0));

                System.out.printf("\"%s\" passed %n", scenario);

            } catch (Throwable e) {
                System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
            }
        }
}
