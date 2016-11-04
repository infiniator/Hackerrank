import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NonDivisibleSubset {
	public static void main(String[] args) throws IOException {
		int n, k, subsetCount = 0;
		int[] a;
		int[] mod;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		n = Integer.parseInt(temp[0]);
		k = Integer.parseInt(temp[1]);
		a = new int[n];
		mod = new int[k];
		
		temp = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp[i]);
			mod[a[i] % k]++;
		}
		
		subsetCount += ((mod[0] >= 1) ? 1 : 0);
		for(int i = 1; i < k / 2 + k % 2; i++)
			subsetCount += ((mod[i] >= mod[k - i]) ? mod[i] : mod[k - i]);
		if(k % 2 == 0)
			subsetCount += ((mod[k / 2] >= 1) ? 1 : 0);
		System.out.println(subsetCount);
	}
}
