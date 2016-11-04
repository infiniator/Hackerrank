import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumpingOnTheClouds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        boolean[] a = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++)
            a[i] = temp[i].equals("0");
        for (int i = 0; i < n - 1; ) {
            if ((i + 2) < n && a[i + 2]) {
                count++;
                i += 2;
            } else {
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
