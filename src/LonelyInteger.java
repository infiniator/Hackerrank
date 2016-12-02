import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LonelyInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int n = Integer.parseInt(temp);
        int[] a = new int[n];
        int[] val = new int[101];
        String[] tempA = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tempA[i]);
            val[a[i]]++;
        }
        for (int i = 0; i < 101; i++) {
            if (val[i] == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}
