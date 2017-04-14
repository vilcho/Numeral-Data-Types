import java.util.Scanner;

/**
 * Created by Vilcho on 4/14/2017.
 */
public class p05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int numMinulLastDigit = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            numMinulLastDigit = i;
            do {
                sum += numMinulLastDigit % 10;
                numMinulLastDigit = numMinulLastDigit / 10;
            } while (numMinulLastDigit > 0);
            {

                if (sum == 5 || sum == 7 || sum == 11) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
                sum = 0;
                numMinulLastDigit = 0;
            }
        }
    }
}

