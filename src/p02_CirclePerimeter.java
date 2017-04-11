import java.util.Scanner;

/**
 * Created by Vilcho on 4/11/2017.
 */
public class p02_CirclePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double perimeter = 2 * Math.PI * r;

        System.out.printf("%.12f", perimeter);
    }
}
