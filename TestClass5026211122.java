import java.util.Scanner;

public class TestClass5026211122 {

    public static void main(String[] args) {

        ComputeMethods5026211122 cm = new ComputeMethods5026211122();
        Scanner scn = new Scanner(System.in);

        // Temprature
        System.out.println("Fahrenheit to Celcius");
        System.out.println("Please insert the temprature's degree ==>");
        double x = scn.nextDouble();
        double celcius = cm.fToC(x);
        System.out.printf("100 F = %f\n", celcius);


        // Phytagoras
        System.out.println("Phytagoras Calculator");
        System.out.println("Masukan panjang sisi pertama ==>");
        double sisi1 = scn.nextDouble();
        System.out.println("Masukan panjang sisi kedua==>");
        double sisi2 = scn.nextDouble();

        double hypotenuse = cm.hypotenuse (sisi1,sisi2);
        System.out.println("Hypotenuse = " + hypotenuse);

        // Dice
        System.out.println("How many dice appear ?");
        System.out.println("Let's see how lucky you are today.");
        int rollDice = cm.roll();

        System.out.println("How lucky you are today? =" + rollDice);

    }

}