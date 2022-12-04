import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int king = 1;
        int queen = 1;
        int r = 2;
        int b = 2;
        int k = 2;
        int p = 8;

        king = king - sc.nextInt();
        queen = queen - sc.nextInt();
        r = r - sc.nextInt();
        b = b - sc.nextInt();
        k = k - sc.nextInt();
        p = p - sc.nextInt();

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(r + " ");
        System.out.print(b + " ");
        System.out.print(k + " ");
        System.out.print(p + " ");
    }
}