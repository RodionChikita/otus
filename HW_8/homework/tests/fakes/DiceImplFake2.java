package homework.tests.fakes;

import homework.app.Dice;

public class DiceImplFake2 implements Dice {
    private boolean isFirstCall = true;
    @Override
    public int roll() {
        if(isFirstCall) {
            isFirstCall = false;
            return 6;
        }
        return 1;
    }
}
