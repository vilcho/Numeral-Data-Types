import java.util.Scanner;

/**
 * Created by Vilcho on 4/13/2017.
 */
public class p04_Transport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil((double) n / (4+8+12));

        System.out.println((int) courses);
    }
}
