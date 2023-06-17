package homework.tests;

import homework.app.Game;
import homework.app.Player;
import homework.assertions.Assertions;
import homework.tests.fakes.DiceImplFake3;
import homework.tests.fakes.GameWinnerConsolePrinterFake;

import java.util.ArrayList;

public class GameTest3 {
    private final DiceImplFake3 dice = new DiceImplFake3();
    private final ArrayList<Player> actualFlow = new ArrayList<>();
    private final GameWinnerConsolePrinterFake winnerPrinter = new GameWinnerConsolePrinterFake(actualFlow) ;
    private final Game game = new Game(dice, winnerPrinter);


    public void testGameWithWinnerPlayer2() {
        String scenario = "Тест победил второй игрок";
        try {
            Player player1 = new Player("Player 1");
            Player player2 = new Player("Player 2");
            game.playGame(player1, player2);
            Assertions.assertEquals(player2, actualFlow.get(0));

            System.out.printf("\"%s\" passed %n", scenario);

        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
