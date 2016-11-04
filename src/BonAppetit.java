import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BonAppetit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, k, b, sum = 0;
        int[] c;
        String[] temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        k = Integer.parseInt(temp[1]);
        c = new int[n];
        temp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(temp[i]);
            if (i != k)
                sum += c[i];
        }
        b = Integer.parseInt(br.readLine());
        if (sum / 2 != b)
            System.out.println(c[k] / 2);
        else
            System.out.println("Bon Appetit");

    }
}
