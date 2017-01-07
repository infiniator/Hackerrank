import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbsolutePermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] temp;
        int n, k;
        int[] perm;
        for (int i = 0; i < t; i++) {
            temp = br.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            k = Integer.parseInt(temp[1]);
            perm = new int[n + 1];
            if (k == 0)
                for (int j = 1; j <= n; j++)
                    System.out.print(j + " ");
            else if (k <= n / 2 && n % k == 0 && (n / k) % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if ((j / k % 2) == 0)
                        perm[j] = j + k + 1;
                    else
                        perm[j] = j - k + 1;
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(perm[j] + " ");
                }
            } else
                System.out.print("-1");
            System.out.println();
        }
    }
}
