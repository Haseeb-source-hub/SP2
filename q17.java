import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3 = s.nextLine();

        String middle;

        // Check if s1 is between s2 and s3
        if ((s1.compareTo(s2) >= 0 && s1.compareTo(s3) <= 0) ||
                (s1.compareTo(s2) <= 0 && s1.compareTo(s3) >= 0)) {
            middle = s1;
        }
        // Check if s2 is between s1 and s3
        else if ((s2.compareTo(s1) >= 0 && s2.compareTo(s3) <= 0) ||
                (s2.compareTo(s1) <= 0 && s2.compareTo(s3) >= 0)) {
            middle = s2;
        }
        // Otherwise, s3 must be the middle
        else {
            middle = s3;
        }

        System.out.println(middle);
    }
}
