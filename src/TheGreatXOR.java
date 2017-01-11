import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheGreatXOR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        long x;
        for (int i = 0; i < q; i++) {
            //x = Long.parseLong(br.readLine());
            System.out.println(2 * Long.highestOneBit(x = Long.parseLong(br.readLine())) - x - 1);
        }
    }
}
