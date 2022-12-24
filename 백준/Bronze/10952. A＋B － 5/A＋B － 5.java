import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String rL = br.readLine();
            int a = Integer.parseInt(rL.split(" ")[0]);
            int b = Integer.parseInt(rL.split(" ")[1]);
            if (a == 0 && b == 0) break;
            bw.write(a+b+"\n");
            bw.flush();
        }
    }
}