import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int a = scanner.nextInt();
        System.out.println("Enter an int: ");
        int b = scanner.nextInt();
        int smaller = Math.min(a, b);
        System.out.print(smaller);
    }
}