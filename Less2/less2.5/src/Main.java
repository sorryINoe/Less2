import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  c = 0;
        String n = scanner.next();
        if (!n.matches( "[0-9]+")) {
            System.out.println("Вы не ввели целое число.");
            return;
        }
        int num = Integer.parseInt(n);

        for (int i = 1 ; i < num ; i++) {
            c += i;


        }
        System.out.println( c );
    }
}