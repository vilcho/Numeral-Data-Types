import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Vilcho on 4/13/2017.
 */
public class p03_ExactProductOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //tiva ne raboti! Edinia test v Judge ne izliza!
        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal num1 = BigDecimal.valueOf(1.0);
        //BigDecimal num2 = BigDecimal.valueOf(1.0);

        BigDecimal ExactProduct = BigDecimal.valueOf(1);

        for (int i = 1; i <= n ; i++) {
            num1 = new BigDecimal(scanner.nextLine());
            ExactProduct = ExactProduct .multiply(num1);
        }
        System.out.println(ExactProduct);
    }
}
