import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AngryProfessor {
	public static void main(String[] args) throws IOException {
		int t, n, k;
		int[] a;
		int count;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		t = Integer.parseInt(temp);
		for(int i = 0; i < t; i++) {
			temp = br.readLine();
			n = Integer.parseInt(temp.split(" ")[0]);
			k = Integer.parseInt(temp.split(" ")[1]);
			a = new int[n];
			count = 0;
			
			temp = br.readLine();
			for(int j = 0; j < n; j++) {
				a[j] = Integer.parseInt(temp.split(" ")[j]);
				if(a[j] <= 0)
					count++;
			}
			
			if(count < k)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
