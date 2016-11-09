import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FibonacciModified {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        BigInteger t1 = BigInteger.valueOf(Integer.parseInt(temp[0]));
        BigInteger t2 = BigInteger.valueOf(Integer.parseInt(temp[1]));
        BigInteger t3;
        int n = Integer.parseInt(temp[2]);
        t3 = t1.add(t2.pow(2));
        int i = 3;
        while (i < n) {
            t1 = t2;
            t2 = t3;
            t3 = t1.add(t2.pow(2));
            i++;
        }
        System.out.println(t3.toString());
    }
}
