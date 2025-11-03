public class Expressions {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 17;
        System.out.println((a + b) / c);
        // 3 and 4 are added with sum 7
        // 7 is divided by 5 with quotient 1
        System.out.println(a + b / c);
        // 4 is divided by 5 with quotient 0
        // 3 is added to 0 with sum 3
        System.out.println(a + 1);
        // 3 + 1 = 4
        System.out.println(d % c);
        // 17 / 5 = 3 r 2
        // % wants the remainder so it is 2
        System.out.println(d / c);
        // 17 / 5 = 3
        System.out.println(d % b);
        // 17 / 4 = 4 r 1
        // % wants remainder, so it is 1
        System.out.println(d / b);
        // 17 / 4 = 4
        System.out.println(d + a / d + b);
        // 17 + 3 / 17 = 17.18
        // 17.18 + 4 = 21.18
        System.out.println((d + a) / (d + b));
        // 17 + 3 = 20
        // 17 + 4 = 21
        // (20)/(21) = 0.952 so 0
        System.out.println(Math.sqrt(b));
        // sqrt of 4 is 2.0
        System.out.println(Math.pow(a, b));
        // 3 to power of 4 is 81
        System.out.println(Math.abs(-a));
        // absolute value of -3 is 3
        System.out.println(Math.max(a, b));
        // Max is 4
    }
}