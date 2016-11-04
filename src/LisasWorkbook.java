import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LisasWorkbook {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n, k;
        n = Integer.parseInt(temp[0]);
        k = Integer.parseInt(temp[1]);
        int[] t = new int[n];
        int[] lastPage = new int[n];
        temp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(temp[i]);
            lastPage[i] = ((i > 0) ? lastPage[i - 1] : 0) + t[i] / k + 1;
        }
    }
}
