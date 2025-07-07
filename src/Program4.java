import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Give me any amount of seconds: ");
        String originalSec = s.nextLine();
        int intSec = Integer.parseInt(originalSec);
        int sec = intSec%60;
        int originalMin = intSec/60;
        int min = originalMin%60;
        int hour = originalMin/60;
        System.out.println(hour+" hours, "+min+" minutes, "+sec+" seconds.");
    }
}