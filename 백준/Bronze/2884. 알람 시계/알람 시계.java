import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        System.out.print(M >= 45 ? H : H == 0 ? H = 23 : H-1);
        System.out.print(" ");
        System.out.println(M >= 45 ? M-45 : 60-(45-M));
    }
}