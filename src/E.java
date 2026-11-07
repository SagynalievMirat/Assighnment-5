import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        boolean found = false;
        for (int i = 1; i < n; i++) {
            if ((a[i] > 0) == (a[i - 1] > 0)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
    }
}
