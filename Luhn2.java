public class Luhn2 {
    public static void main(String[] args) {
        int num = 2315778;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 1234567;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 7654321;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 1111111;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
    }

    public static String checkDigits(int number) {
        // Put your code here
        int sum = 0;
        boolean even = false;
        for (int i = 0; i < 7; i++) {
            int digit = number % 10;
            sum += decode(digit, even);
            number = number / 10;
            even = !even;
        }

        if (sum % 10 == 0) {
            return "valid";
        } else {
            return "invalid";
        }
    }

    public static int decode(int digit, boolean position) {
        // Your code goes here
        if (!position) {
            return digit;
        } else {
            int doubled = digit * 2;
            if (doubled >= 10) {
                int sum = doubled - 9;
                return sum;
            } else {
                return doubled;
            }
        }
    }
}