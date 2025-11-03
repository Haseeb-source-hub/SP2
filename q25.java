import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        double total = 0;

        while (true) {
            if (s.hasNextDouble()) {
                double num = s.nextDouble();
                total += num;
                count++;
            } else {
                String input = s.nextLine();
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("invalid");
                }
            }
        }
        System.out.println(total);
        System.out.println(count);
    }
}