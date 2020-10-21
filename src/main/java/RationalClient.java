public class RationalClient {
    
    public static void main(String[] args) {
        Rational r = new Rational(1, 2);
        System.out.println(r);

        // We can use dot notation to access the integer values
        // of the numerator and denominator directly
        System.out.println(r.numerator);
        System.out.println(r.denominator);
        // int arr[] = new int[5];
        // System.out.println[arr.length];
        // In this example, length is an instance variable for the array class

        Rational s = new Rational(1, 3);
        System.out.println(s);
        Rational t = Rational.add(r, s);
        System.out.println(t);
        Rational x = new Rational(6, 12);
        Rational y = Rational.simplify(x);
        System.out.println(y);
    }
}
