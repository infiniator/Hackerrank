import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UtopianTree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int t = Integer.parseInt(temp);
        int n, result;
        for (int i = 0; i < t; i++) {
            temp = br.readLine();
            n = Integer.parseInt(temp);
            result = 1 + 2 * (int) (Math.pow(2, n / 2) - 1);
            if (n % 2 == 1)
                result *= 2;
            System.out.println(result);
        }
    }
}
