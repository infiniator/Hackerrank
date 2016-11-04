import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HikingSelfies {
    public static void main(String[] args) throws IOException {

        int n, x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        x = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i <= n;i++) {
            sum += C(n, i);
        }
        System.out.println(Math.abs(sum - x));
    }

    static int C(int n, int r) {
        int[] factorials = {
                1,
                1,
                2,
                6,
                24,
                120,
                720,
                5040,
                40320,
                362880,
                3628800
        };
        return (factorials[n] / (factorials[r] * factorials[n - r]));
    }
}
