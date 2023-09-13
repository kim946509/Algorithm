import java.util.ArrayList;
import java.util.Scanner;

public class q4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            ArrayList<Integer> num = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                num.add(sc.nextInt());
            }
            int sum = 0;
            for (int j : num) {
                sum += j;
            }
            double avg = (double) sum / k;
            int count = 0;
            for (int j : num) {
                if (j > avg)
                    count++;
            }
            System.out.printf("%.3f%%\n", (double) count / k * 100);
        }

        sc.close();
    }
}
