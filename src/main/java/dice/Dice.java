import java.util.Random;
/**
* Dice class stores method roll.
*/

public class Dice {    
  /**
  * roll method uses a side parameter to roll a dice with side amount of sides.
  */
  public int roll(int sides) {
    Random random = new Random(); 
    int dice = random.nextInt(sides) + 1;
    return dice;
  }
}