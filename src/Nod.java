import java.util.Scanner;

public class Nod {
    public static void calc(int r, int z) {
        if (r == 0) {
            System.out.println(z);
            System.exit(0);
        }
        if (z == 0) {
            System.out.println(r);
            System.exit(0);
        }
        if (r > z) {
            calc(r % z, z);
        } else {
            calc(r, z % r);
        }
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n == m) {
            System.out.println(n);
        } else {
            calc(n, m);
        }
    }
}
