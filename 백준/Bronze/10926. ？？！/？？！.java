import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();

        if (id.length() > 50) {
            return;
        }

        System.out.println(id.toLowerCase() + "??!");
    }
}