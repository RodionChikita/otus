package homework.tests.fakes;

import homework.app.GameWinnerPrinter;
import homework.app.Player;

import java.util.List;

public class GameWinnerConsolePrinterFake implements GameWinnerPrinter {
    private final List<String> actualFlow;

    public GameWinnerConsolePrinterFake(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }

    @Override
    public void printWinner(Player winner) {
        actualFlow.add(winner.getName());
    }
}
