import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String source = br.readLine();
        int k = Integer.parseInt(br.readLine());
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (source.charAt(i) >= 65 && source.charAt(i) <= 90)
                myString.append((char) (65 + (source.charAt(i) + k - 65) % 26));
            else if (source.charAt(i) >= 97 && source.charAt(i) <= 122)
                myString.append((char) (97 + (source.charAt(i) + k - 97) % 26));
            else
                myString.append(source.charAt(i));
        }
        System.out.println(myString);
    }
}
