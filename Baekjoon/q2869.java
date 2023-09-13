import java.util.Scanner;

public class q2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 낮에 올라가는 길이
        int a = sc.nextInt();

        // 밤에 내려가는 길이
        int b = sc.nextInt();

        // 막대 총길이
        int v = sc.nextInt();
        v = v - b;

        int result = (int) Math.ceil((double) v / (a - b));
        System.out.println(result);

    }
}
