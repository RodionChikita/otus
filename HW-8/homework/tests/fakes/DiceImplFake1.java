package homework.tests.fakes;

import homework.app.Dice;

public class DiceImplFake1 implements Dice {
    @Override
    public int roll() {
        return 1;
    }
}
