import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JourneyScheduling {
	static int n, m;
	static int[][] tree;
	static int[][] trips;
	static int[] visitCount;
	static int[][] distanceMatrix;
	public static void main(String[] args) throws NumberFormatException, IOException {
		String temp;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		temp = br.readLine();
		n = Integer.parseInt(temp.split(" ")[0]);
		m = Integer.parseInt(temp.split(" ")[1]);
		tree = new int[n - 1][2];
		for(int i = 0; i < n - 1; i++) {
			temp = br.readLine();
			tree[i][0] = Integer.parseInt(temp.split(" ")[0]);
			tree[i][1] = Integer.parseInt(temp.split(" ")[1]);
		}
		trips = new int[m][2];
		visitCount = new int[n];
		distanceMatrix = new int[n][n];
		for(int i = 0; i < m; i++) {
			temp = br.readLine();
			trips[i][0] = Integer.parseInt(temp.split(" ")[0]);
			trips[i][1] = Integer.parseInt(temp.split(" ")[1]);
			//start computing for each trip here
		}
		
		/*
		distanceMatrix = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j > i) {
					//calculate distance
				}
				else
					distanceMatrix[i][j] = distanceMatrix[j][i];
			}
		}
		*/
		
	}
	/*
	static int calculateDistance() {
		return 0;
	}
	*/
}
