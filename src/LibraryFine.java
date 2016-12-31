import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryFine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        String[] temp2 = br.readLine().split(" ");
        int[] actual = new int[3];
        int[] expected = new int[3];
        for (int i = 0; i < 3; i++) {
            actual[i] = Integer.parseInt(temp[i]);
            expected[i] = Integer.parseInt(temp2[i]);
        }
        int fine = 0;
        if (expected[2] < actual[2])
            fine = 10000;
        else if(expected[2] == actual[2] && expected[1] < actual[1])
            fine = (actual[1] - expected[1]) * 500;
        else if(expected[2] == actual[2] && expected[1] == actual[1] && expected[0] < actual[0])
            fine = (actual[0] - expected[0]) * 15;
        System.out.println(fine);
    }
}
