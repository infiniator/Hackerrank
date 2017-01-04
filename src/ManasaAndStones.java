import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManasaAndStones {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n, a, b;
        int sum;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            if (a > b) {
                sum = a;
                a = b;
                b = sum;
            }
            if (a != b)
                for (int j = 0; j < n; j++) {
                    sum = a * (n - j - 1) + b * j;
                    System.out.print(sum + " ");
                }
            else
                System.out.print(a * (n - 1) + " ");
            System.out.println();
        }
    }
}
