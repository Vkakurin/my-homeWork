package students.Vkakurin.encapsulation;

public class PowerCalculatorTest {
    public static void main(String[] args) {
;
        System.out.println(PowerCalculator(4,3));
    }

    public static double PowerCalculator(double num, int degree) {
        double resalt = num;
        for (int i = 0; i < degree-1; i++) {
          resalt *= num;
        }
        return resalt;
    }
}
