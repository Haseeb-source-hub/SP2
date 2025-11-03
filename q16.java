import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3 = s.nextLine();

        String middle;

        if (s1.compareTo(s2) < 0) { // s1 < s2
            if (s2.compareTo(s3) < 0) { // s1 < s2 < s3
                middle = s2;
            } else if (s1.compareTo(s3) < 0) { // s1 < s3 < s2
                middle = s3;
            } else { // s3 < s1 < s2
                middle = s1;
            }
        } else { // s2 <= s1
            if (s1.compareTo(s3) < 0) { // s2 < s1 < s3
                middle = s1;
            } else if (s2.compareTo(s3) < 0) { // s2 < s3 < s1
                middle = s3;
            } else { // s3 < s2 < s1
                middle = s2;
            }
        }

        System.out.println(middle);
    }
}
