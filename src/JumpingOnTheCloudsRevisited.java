import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n, k;
        n = Integer.parseInt(temp[0]);
        k = Integer.parseInt(temp[1]);
        temp = br.readLine().split(" ");
        boolean[] c = new boolean[n];
        for (int i = 0; i < n; i++) {
            c[i] = temp[i].equals("1");
        }
        int i = k % n;
        int e = c[i] ? 97 : 99;
        while (i != 0) {
            i = (i + k) % n;
            e -= c[i] ? 3 : 1;
        }
        System.out.println(e);
    }
}
