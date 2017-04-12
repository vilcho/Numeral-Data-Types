import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

/**
 * Created by Vilcho on 4/11/2017.
 */
public class p02_CirclePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        BigDecimal perimeter = BigDecimal.valueOf(2) .multiply(BigDecimal.valueOf(Math.PI))
                .multiply(BigDecimal.valueOf(r), new MathContext(15));

        System.out.printf("%.12f", perimeter);
    }
}
