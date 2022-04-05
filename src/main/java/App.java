import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class App {
    private static NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
    private static DecimalFormat df = (DecimalFormat) nf;

    public static void main(String[] args) {
        System.out.println(divide(4.0, 3.0));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        } else if (a == 0) {
            return 0;
        } else {
            return Double.parseDouble(df.format(a / b));

        }

    }

    public static String firstTwo(String str) {
        if (str != null) {
            if (str.isEmpty() || str.length() < 2) {
                return str;
            } else {
                return str.substring(0, 2);
            }
        } else {
            return null;
        }
    }

    public static Double div(Double a, Double b) {
        if (a == null || b == null || b == 0) {
            return null;
        } else {
            return new Double(a / b);
        }
    }


}
