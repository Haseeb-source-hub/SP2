public class q24 {
    public static void main(String[] args) {
        int n = 100;
        int i = 1;
        int total = 0;

        do {
            total += i;
            i++;
        } while (i <= n);
        System.out.println(total);
    }
}