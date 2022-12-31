import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        int max = 0;
        int cnt = 0;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            cnt++;
            if (arr[i] > max) {
                max = arr[i];
                idx = cnt;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}