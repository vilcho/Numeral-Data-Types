import java.util.Scanner;

/**
 * Created by Vilcho on 4/11/2017.
 */
public class p01_TimeSinceBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte century = Byte.parseByte(scanner.nextLine());

        int age = century * 100;
        int days = (int)(age * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes.", century, age, days, hours, minutes);
    }
}
