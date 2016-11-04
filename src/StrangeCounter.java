import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrangeCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine()), value = 3;
        for(int i = 1; value < t; i++) {
            value += 3 * Math.pow(2, i);
        }
        System.out.println(value - t + 1);
    }
}
