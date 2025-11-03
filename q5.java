import java.util.Scanner;
import java.util.ArrayList;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Read numbers from the user
        while (true) {
            System.out.print("Enter a number: ");
            int x = s.nextInt();

            if (x == -1) {
                break;
            }
            numbers.add(x);
        }

        // Number of items entered
        int itemCount = numbers.size();
        System.out.println("# of items: " + itemCount);

        // Average of all numbers
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        double avg = (double) total / itemCount;
        System.out.println("Average: " + avg);

        // Separate even numbers and compute sum of odd numbers
        ArrayList<Integer> evens = new ArrayList<>();
        int oddSum = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                evens.add(n);
            } else {
                oddSum += n;
            }
        }

        // Standard deviation of even numbers
        double stdDev = 0;
        if (!evens.isEmpty()) {
            double evenTotal = 0;
            for (int n : evens) {
                evenTotal += n;
            }
            double evenAvg = evenTotal / evens.size();

            double sumSq = 0;
            for (int n : evens) {
                sumSq += Math.pow(n - evenAvg, 2);
            }
            stdDev = Math.sqrt(sumSq / evens.size());
        }

        System.out.printf("Standard deviation of even numbers: %.2f\n", stdDev);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
