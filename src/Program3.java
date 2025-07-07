import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please give me your weight: ");
        String weightString = s.nextLine();
        double weight = Double.parseDouble(weightString);
        double mercuryWeight = weight * 0.4;
        double venusWeight = weight * 0.9;
        double marsWeight = weight * 0.38;
        double jupiterWeight = weight * 2.3;
        double saturnWeight = weight * 1.1;
        double uranusWeight = weight * 0.92;
        double neptuneWeight = weight * 1.2;
        System.out.println("Your weight in Mercury is: " + mercuryWeight);
        System.out.println("Your weight in Venus is: " + venusWeight);
        System.out.println("Your weight in Mars is: " + marsWeight);
        System.out.println("Your weight in Jupiter is: " + jupiterWeight);
        System.out.println("Your weight in Saturn is: " + saturnWeight);
        System.out.println("Your weight in Uranus is: " + uranusWeight);
        System.out.println("Your weight in Neptune is: " + neptuneWeight);
    }
}