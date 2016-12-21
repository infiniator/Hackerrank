import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TailorShop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int p = Integer.parseInt(temp[1]);
        temp = br.readLine().split(" ");
        int[] a = new int[n];
        long[] count = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(temp[i]);
            count[i] = a[i] / p + (a[i] % p == 0 ? 0 : 1);
        }
        Arrays.sort(count);
        int flag = 0;
        long lowerBound = count[0], upperBound = count[count.length - 1];
        for (int i = 1; i < n; i++) {
            if (count[i] == count[flag])
                upperBound++;//what if the new flag index has value equal to incremented value?
            else
                flag = i;
        }
        long sum = 0;
        for (int i = 0; i < n; i++)
            sum += lowerBound + i;
        System.out.println(sum);
    }
}
