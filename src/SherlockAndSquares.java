import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockAndSquares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tem = br.readLine();
        int t = Integer.parseInt(tem), a, b, sqrt1, sqrt2;
        String[] temp;
        for (int i = 0; i < t; i++) {
            temp = br.readLine().split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);
            sqrt1 = (int) Math.ceil(Math.sqrt(a));
            sqrt2 = (int) Math.sqrt(b);
            if (sqrt1 > sqrt2) {
                System.out.println("0");
                continue;
            }
            System.out.println(sqrt2 - sqrt1 + 1);
        }
    }
}
