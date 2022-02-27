import java.util.Random;

public class ComputeMethods5026211122 {

    // Temprature
    public double fToC (double degreesF) {
        return 5 / 9.0 * (degreesF - 32);
    }

    // Phytagoras
    public double hypotenuse (double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    // Dice
    public int roll () {

        Random random = new Random();

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 2;

        return dice1 + dice2;
    }
}