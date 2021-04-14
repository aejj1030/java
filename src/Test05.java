/*
 * Y T O J E
 * X S N I D
 * W R M H C 
 * V Q L G B
 * U P K F A
 */
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("nÀ» ÀÔ·Â : ");
		int n = in.nextInt();
		char arr[][] = new char[n][n];
		int step = 0;
		
		for(int i=n-1; i>=0; --i) {
			for(int j=n-1; j>=0; --j) {
				arr[j][i] = (char)(65+step);
				step++;
				if (step > 25) step = 0;
			}
		}
		
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
