import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _MorganAndAString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String str1, str2, finalStr = "";
        for (int i = 0; i < t; i++) {
            str1 = br.readLine();
            str2 = br.readLine();
            finalStr = singleString(str1, str2);
        }
        System.out.println(finalStr);
    }

    private static String singleString(String str1, String str2) {
        int i = 0, j = 0;
        String finalStr = "";
        while (i < str1.length() && j < str2.length()) {
            finalStr += (str1.charAt(i) <= str2.charAt(j)) ? str1.charAt(i++) : str2.charAt(j++);
        }
        finalStr += (i < str1.length()) ? str1.substring(i, str1.length()) : str2.substring(j, str2.length());
        return finalStr;
    }
}
