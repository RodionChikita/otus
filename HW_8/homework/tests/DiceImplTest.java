package homework.tests;

import homework.app.DiceImpl;
import homework.assertions.Assertions;

public class DiceImplTest {
    private final DiceImpl Dice = new DiceImpl();

    public void testDiceImplOnNumberOfPoints() {
        String scenario = "Тест на количество очков";
        try {
            int actual = Dice.roll();
            Assertions.assertEquals(1, 6, actual);

            actual = Dice.roll();
            Assertions.assertEquals(1, 6, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }
}
