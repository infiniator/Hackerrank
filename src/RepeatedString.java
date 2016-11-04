import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long n = Long.parseLong(br.readLine());
        int countPerStr = 0, partCount = 0;
        long totalCount = 0;

        long strRep = n / s.length(); //number of times the whole string appears
        long strPartLen = n % s.length(); //the length of the part of string, appears at end after strRep repetitions
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                countPerStr++;
            if (i < strPartLen && s.charAt(i) == 'a')
                partCount++;
        }
        totalCount += countPerStr * strRep + partCount;
        System.out.println(totalCount);
    }
}
