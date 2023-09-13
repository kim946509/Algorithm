import java.util.Scanner;

public class q2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int k = 100;
        int result[] = new int[4];
        result[3] = a * b;

        for (int i = 0; i < 3; i++) {
            result[2 - i] = a * (b / k);
            b = b - (b / k) * k;
            k /= 10;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
