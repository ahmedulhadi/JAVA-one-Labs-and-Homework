public class Harmonic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(harmonic(3));
    }
    public static double harmonic(int n) {
        double result = 0.0; // in addition you start from 0 and in mulipication result starts 1
        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);
        }
        return result;
    }

}