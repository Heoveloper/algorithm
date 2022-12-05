import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b;

        ArrayList<Integer> bArr = new ArrayList<>();
        while (b > 0) {
            bArr.add(b%10);
            b /= 10;
        }

        System.out.println(a * bArr.get(0));
        System.out.println(a * bArr.get(1));
        System.out.println(a * bArr.get(2));
        System.out.println(a * c);
    }
}