import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the speed in mph");
        int speed = in.nextInt();
        System.out.println("Enter the number of hours spent traveling");
        int hoursTraveled = in.nextInt();

        System.out.println("\nHour\t\tDistance Traveled");
        System.out.println("-----------------------------");
        for (int hour = 1; hour <= hoursTraveled; hour++) {
            int distance = (speed * hour);
            System.out.printf("%d%20d\n", hour, distance);
        }
    }
}