import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int t = Integer.parseInt(temp);
        Integer n;
        int count;
        int ti;
        for (int i = 0; i < t; i++) {
            temp = br.readLine();
            n = Integer.parseInt(temp);
            count = 0;
            for (int j = 0; j < temp.length(); j++) {
                ti = Integer.parseInt(temp.substring(j, j + 1));
                if (ti > 0 && n % ti == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
