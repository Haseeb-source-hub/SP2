public class Arrays2 {
    public static void main(String[] args) {
        double[] x = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
        System.out.println("Before rotation: ==============================");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]: " + x[i]);
        }
        x = rotate(x, 3);
        System.out.println("After rotation: ==============================");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]: " + x[i]);
        }
    }

    // Your method goes here.
    public static double[] rotate(double[] array, int n) {
        double[] rotated = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = ((i + n) % array.length);
            rotated[newIndex] = array[i];
        }
        return rotated;
    }
}
// 18, 2, 100, 8, 4, 5, 21, 7, 9