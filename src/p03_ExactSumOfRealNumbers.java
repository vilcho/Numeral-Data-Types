import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Vilcho on 4/13/2017.
 */
public class p03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal num1 = BigDecimal.valueOf(0);

        BigDecimal ExactSum = BigDecimal.valueOf(0);

        for (int i = 1; i <= n ; i++) {
            num1 = new BigDecimal(scanner.nextLine());
            ExactSum = ExactSum .add(num1);
        }
        System.out.println(ExactSum);
    }
}
