import java.util.Scanner;

public class ProcessAName5026211122 {

    public static void main(String[] args) {
        Scanner firstName = new Scanner(System.in);
        System.out.println("Please type Your Name here ==>");

        String surName = firstName.nextLine();
        int x  = surName.indexOf (' ');

        String Format;
        Format = surName.substring(x + 1) + "," + surName.charAt(0)+ ".";

        System.out.println("Your name is ==>" + Format);

    }

}