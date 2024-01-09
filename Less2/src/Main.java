import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Число " + x + " четное");
        } else {
            System.out.println("Число " + x + " нечетное");
        }
    }
}