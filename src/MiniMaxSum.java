import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        long sum = 0, max = Long.MIN_VALUE, min = Long.MAX_VALUE, t;
        for (int i = 0; i < 5; i++) {
            t = Integer.parseInt(temp[i]);
            sum += t;
            max = max <= t ? t : max;
            min = min > t ? t : min;
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
