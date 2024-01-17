import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DiceTest{

    @Test
    void checkDiceInRange(){
        Dice dice = new Dice();
        for(int i = 0; i < 100, i++){
            int result = dice.roll(6)
            assert (result >= 1 && result <= 6)
            System.out.println(result);
        }
    }
}