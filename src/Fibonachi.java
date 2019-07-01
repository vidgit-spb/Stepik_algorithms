import java.util.Scanner;

public class Fibonachi {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        if (n == 1) {
            System.out.println(1);
        } else {
            arr[0] = 1;
            arr[1] = 1;
             for (int i = 2; i < n + 1; i++) {
                arr[i] = arr[i-1]+ arr[i-2];
             }
            System.out.println(arr[n - 1]);
        }
    }
}
