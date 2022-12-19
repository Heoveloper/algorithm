import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String rL = br.readLine();
            int a = Integer.parseInt(rL.split(" ")[0]);
            int b = Integer.parseInt(rL.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}