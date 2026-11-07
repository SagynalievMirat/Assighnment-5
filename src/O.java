import java.util.*;

public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int destroyed = 0;
        boolean found = true;
        while (found) {
            found = false;
            int i = 0;
            while (i < a.size()) {
                int j = i;
                while (j < a.size() && a.get(j).equals(a.get(i))) {
                    j++;
                }
                if (j - i >= 3) {
                    destroyed += j - i;
                    a.subList(i, j).clear();
                    found = true;
                    break;
                }
                i = j;
            }
        }
        System.out.println(destroyed);
    }
}
