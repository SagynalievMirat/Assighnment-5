import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            if (x > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}