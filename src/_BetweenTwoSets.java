import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int m, n;
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);
        temp = br.readLine().split(" ");
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(temp[i]);
        }
        temp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(temp[i]);
        }
        //forward
    }
}
