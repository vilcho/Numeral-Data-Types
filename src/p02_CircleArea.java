import java.util.Scanner;

/**
 * Created by Vilcho on 4/11/2017.
 */
public class p02_CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double circle = Math.PI * r * r;

        System.out.printf("%.12f", circle);
    }
}
