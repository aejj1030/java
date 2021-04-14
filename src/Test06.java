/* 홀수만 들어와야하고 짝수만 들어오는거랑 다름
 *   A
 *  BCD
 * EFGHI
 *  JKL
 *   M
 */
/*
 * 0.2
 * 1.1 1.2 1.3
 * 2.0 2.1 2.2 2.3 2.4
 * 3.1 3.2 3.3
 * 4.2
 */
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("n을 입력 : ");
		int n = in.nextInt();
		char arr[][] = new char[n][n];
		int step = 0;
		int i = 0;
		int start = n/2, end = n/2;
		int sign = 1;
		
		while(true) {
			for(int j=start; j<=end; ++j) {
				arr[i][j] = (char)(65+step);
				step++;
				if (step>25) step = 0;
			}
			i++;	if (i==n) break;
			
			if (i > n/2) sign = -1;
			start -= sign; end += sign;
			 
		}
		
		for(i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

