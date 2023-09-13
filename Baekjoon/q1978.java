import java.util.Scanner;

public class q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int count = 0;
        boolean result = true;
        for (int i = 0; i < n; i++) {

            result = true;

            if (arr[i] == 1) {
                count++;
                continue;
            }
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (arr[i] % j == 0) {
                    result = false;
                    break;
                }
            }
            if (result == true)
                count++;
        }
        System.out.println(count);
    }
}
