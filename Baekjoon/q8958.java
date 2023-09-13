import java.util.Scanner;

public class q8958 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int count = 0;
        int sum = 0;
        String arr = "";
        for (int i = 0; i < n; i++) {
            arr = sc.next();
            count = 0;
            sum = 0;
            for (int j = 0; j < arr.length(); j++) {
                if (arr.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }

        sc.close();
    }
}