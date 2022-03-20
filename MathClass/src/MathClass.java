import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = sc.nextDouble();

        System.out.println("Enter side y: ");
        y = sc.nextDouble();

        z = Math.sqrt((x * x) + (y + y));
        System.out.println("The hypotenous is: " + z);

        sc.close();
    }
}
