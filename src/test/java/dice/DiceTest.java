import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
/**
 * Test class tests to see if the code does what I want.
 */

public class DiceTest {

  @Test
  void checkDiceInRange() {
    Dice dice = new Dice();
    for (int i = 0; i < 100; i++) {
      int result = dice.roll(6);
      assertTrue(result >= 1);
      assertTrue(result <= 6);
      System.out.println(result);
    }
  }
}