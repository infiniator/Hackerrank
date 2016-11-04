import java.io.*;

public class SaveThePrisoner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long n, m, s;
        String[] temp;
        for (int i = 0; i < t; i++) {
            temp = br.readLine().split(" ");
            n = Long.parseLong(temp[0]);
            m = Long.parseLong(temp[1]);
            s = Long.parseLong(temp[2]);
            System.out.println(((m % n + s - 1) % n == 0) ? n : (m % n + s - 1) % n);
        }
    }
}
