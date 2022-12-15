import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int reward = 0;

        if (d1 == d2) reward = (d1 == d3) ? d1*1000+10000 : d1*100+1000;
        else if (d1 == d3) reward = (d1 == d2) ? d1*1000+10000 : d1*100+1000;
        else if (d2 == d3) reward = (d2 == d1) ? d1*1000+10000 : d2*100+1000;
        else reward = Math.max(Math.max(d1, d2), d3)*100;

        System.out.println(reward);
    }
}