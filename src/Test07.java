/*
 *   A
 *  BIH
 * CJMLG
 *  DKF
 *   E
 */
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("nÀ» ÀÔ·Â : ");
		int n = in.nextInt();
		char arr[][] = new char[n][n];
		int step = 0;
		int i = 0, j = n/2;

		int signI = 1, signJ = -1;
		int k = 0;
		
		while(k<=n/2) {
			
			arr[i][j] = (char)(65+step);
			
			step++;
			i += signI;	
			if (i==n-k) {
				signI = -1;
				i = n-(k+2);
			}
			j += signJ;
			if (j==n-k) {
				signJ = -1;
				j = n-(k+2);
			}
			if (j<k) {
				j = k + 1;
				signJ = 1;
			}
			
			if (arr[i][j] != 0) {
				k++;
				i = k;
				j = n/2;
				signI = 1;
				signJ = -1;
			}
		}
		
		for(i=0; i<n; ++i) {
			for(j=0; j<n; ++j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
