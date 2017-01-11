import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarsExploration {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 3 != 1 && s.charAt(i) != 'S')
                count++;
            else if (i % 3 == 1 && s.charAt(i) != 'O')
                count++;
        }
        System.out.println(count);
    }
}
