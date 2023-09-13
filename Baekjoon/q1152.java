import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        int n = 0;

        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == ' ') {
                n++;
            }
        }

        n = n + 1;

        if (arr.charAt(0) == ' ') {
            n--;
        }

        if (arr.charAt(arr.length() - 1) == ' ') {
            n--;
        }

        System.out.println(n);
    }
}
