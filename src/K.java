import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long prev = sc.nextLong();
        int count = 1;
        for (int i = 1; i < n; i++) {
            long x = sc.nextLong();
            if (x != prev) {
                count++;
            }
            prev = x;
        }
        System.out.println(count);
    }
}