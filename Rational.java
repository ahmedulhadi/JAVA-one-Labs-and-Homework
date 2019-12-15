public class Rational {

    private double numerator;
    private double denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(double p, double q) {
        numerator = p;
        denominator = q;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public void negate() {
        numerator = numerator * -1;
    }

    public void invert() {
        if (denominator != 0 && numerator != 0) {
            double temp = numerator;
            numerator = denominator;
            denominator = temp;
        } else {
            System.out.println("Denominator cannot be zero.");
        }
    }

    public static double findGcd(double n1, double n2) {
        double gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            // Checks if i is factor of both integers
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public Rational reduce() {
        double gcd = findGcd(numerator, denominator);
        double n1 = numerator / gcd;
        double n2 = denominator / gcd;
        Rational r = new Rational(n1, n2);
        return r;
    }

    public Rational add(Rational s) {
        double d = findGcd(this.denominator, s.denominator);
        d = (this.denominator*s.denominator)/d;
        
        double n = (this.numerator)*(d/this.denominator) + (s.numerator)*(d/s.denominator); 
        Rational result = new Rational(n,d);
        
        return result.reduce();
    }

    public static Rational harmonicRational(double n) {
        if (n < 2) {
            return new Rational(1,1);
        } else {
            return new Rational(1,n).add(harmonicRational(n - 1));
        }
    }
    
    public static void main(String[] args) {

        Rational r = Rational.harmonicRational(10);
        System.out.println(r);
        
    }
}
