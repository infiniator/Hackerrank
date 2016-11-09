import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _LisasWorkbook {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n, k;
        n = Integer.parseInt(temp[0]);
        k = Integer.parseInt(temp[1]);
        int[] t = new int[n];
        int[] lastPage = new int[n];
        int[] firstPage = new int[n];
        temp = br.readLine().split(" ");
        int tempVal = 0;
        int specialProblems = 0;
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(temp[i]);
            firstPage[i] = tempVal + 1;
            lastPage[i] = tempVal + t[i] / k + (t[i] % k == 0 ? 0 : 1);
            if (firstPage[i] <= t[i] && lastPage[i] >= t[i]) {
                for (int j = 1; j <= t[i]; j += t[i] / k) {
                    tempVal = t[i] / k + j;
                    //if ()
                }
            }
            tempVal = lastPage[i];
        }
        System.out.println(specialProblems);
    }
}
