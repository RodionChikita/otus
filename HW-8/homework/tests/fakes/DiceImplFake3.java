package homework.tests.fakes;

import homework.app.Dice;

public class DiceImplFake3 implements Dice {
    private boolean isFirstCall = true;
    @Override
    public int roll() {
        if(isFirstCall) {
            isFirstCall = false;
            return 1;
        }
        return 6;
    }
}
