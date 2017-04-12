import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by Vilcho on 4/11/2017.
 */
public class p02_CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //MathContext Math_Ctx = new MathContext(15, RoundingMode.CEILING);

        double r = Double.parseDouble(scanner.nextLine());
        //BigDecimal r = new BigDecimal(scanner.nextLine());

        //double area = Math.PI * r * r;
        BigDecimal area = ((BigDecimal.valueOf(Math.PI)).multiply
                ((BigDecimal.valueOf(r).multiply(BigDecimal.valueOf(r))), new MathContext(15)));


        System.out.printf("%.12f", area);
    }


}
