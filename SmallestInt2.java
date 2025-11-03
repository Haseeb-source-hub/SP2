import java.util.*;

public class SmallestInt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for w:");
        int w = scan.nextInt();
        int smallest = w;
        System.out.println("Enter a value for x:");
        int x = scan.nextInt();
        // x is the smallest value so far
        System.out.println("Enter a value for y:");
        int y = scan.nextInt();
        if (x < smallest) {
            smallest = x; // Update smallest if necessary
        }
        if (y < smallest) {
            smallest = y;
        }
        System.out.println("Enter a value for z:");
        int z = scan.nextInt();
        if (z < smallest) {
            smallest = z; // Update smallest if necessary
        }
        System.out.println("The smallest value was " + smallest);
    }
}