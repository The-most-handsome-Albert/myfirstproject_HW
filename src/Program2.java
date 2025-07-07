import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please give me name one: ");
        String name1 = s.nextLine();
        System.out.print("Please give me name two: ");
        String name2 = s.nextLine();
        System.out.print("Please give me name three: ");
        String name3 = s.nextLine();
        System.out.print(name1+", "+name2+", "+name3);
        }
    }