import java.util.ArrayList;
import java.util.Scanner;

public class q10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList();
        ArrayList<Integer> result = new ArrayList();
        int size = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            num.add(sc.nextInt());
        }

        for (int i = 0; i < size; i++) {
            if (x > num.get(i))
                result.add(num.get(i));
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            System.out.print(" ");
        }
    }
}