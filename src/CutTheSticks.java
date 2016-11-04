import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.TreeMap;

public class CutTheSticks {
    public static void main(String[] args) throws IOException {
        int n, count;
        int[] a;
        SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        n = Integer.parseInt(temp);
        count = n;
        a = new int[n];

        temp = br.readLine();
        String[] tempValues = temp.split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tempValues[i]);
            map.put(a[i], (map.get(a[i]) == null) ? 1 : map.get(a[i]) + 1);
        }

        Object[] keys;
        keys = map.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            System.out.println(count);
            count -= map.get(Integer.parseInt(keys[i].toString()));
        }
    }
}
