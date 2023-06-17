package homework.tests.fakes;

import homework.app.GameWinnerPrinter;
import homework.app.Player;

import java.util.List;

public class GameWinnerConsolePrinterFake implements GameWinnerPrinter {
    private final List<Player> actualFlow;

    public GameWinnerConsolePrinterFake(List<Player> actualFlow) {
        this.actualFlow = actualFlow;
    }

    @Override
    public void printWinner(Player winner) {

        actualFlow.add(winner);
    }
}
