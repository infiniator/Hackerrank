import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViralAdvertising {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		int n, val = 5, sum = 2;
		n = Integer.parseInt(temp.split(" ")[0]);
		for(int i = 2; i < n; i++) {
			sum += (val * 3 / 2);
		}
		System.out.println(sum);
	}
}
