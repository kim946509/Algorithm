import java.util.Scanner;

public class q2753 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        int k = 0;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    k = 1;
            } else
                k = 1;
        }
        System.out.println(k);
    }
}
