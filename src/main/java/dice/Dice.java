import java.util.Random;
public class Dice{

    public int roll(int sides){
        Random random = new Random(); 
        int dice = random.nextInt(sides) + 1;
        return dice;
    }
}