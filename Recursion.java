public class Recursion {

    public static void main(String[] args) {
        System.out.println(harmonicDouble(3));
    }

    public static double harmonicDouble(int n) {
        if (n == 1) {
            return 1.0;
        } else {
            return (1.0 / n) + harmonicDouble(n - 1);
        }
    }
}