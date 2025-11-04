public class PercentagePrinter {
    public static void main(String[] args) {
        // double rate = 8.70;
        // int percentage = (int) (100 * rate);
        // System.out.println(percentage);
        double rate = 8.70;
        double multiplier = 1000;
        long ans = Math.round((rate * multiplier));
        System.out.println(ans);
    }
}