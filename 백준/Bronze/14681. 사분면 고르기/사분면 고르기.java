import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coorX = sc.nextInt();
        int coorY = sc.nextInt();

        if (coorX > 0) System.out.println(coorY > 0 ? 1 : 4);
        else System.out.println(coorY > 0 ? 2 : 3);
    }
}