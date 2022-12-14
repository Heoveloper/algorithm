import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startH = sc.nextInt();
        int startM = sc.nextInt();
        int t = sc.nextInt();
        int endH = startH;
        int endM = startM+t;

        if (endM >= 60) {
            endH += endM/60;
            if (endH > 23) endH -= 24;
            endM %= 60;
        }

        System.out.println(endH + " " + endM);
    }
}