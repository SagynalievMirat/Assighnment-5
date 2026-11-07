import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max = sc.nextLong();
        for (int i = 1; i < n; i++) {
            long x = sc.nextLong();
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}