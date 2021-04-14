/*
 * n을 입력하면 아래와 같이 출력하는 프로그램
 * ex n = 5
 * A J K T U
 * B I L S V
 * C H M R W
 * D G N Q X
 * E F O P Y
 */
import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("n을 입력 : ");
		int n = in.nextInt();
		char arr[][] = new char[n][n];
		int step = 0;

		for(int j=0; j<n; ++j) {
			if (j%2==0) {
				for(int i=0; i<=n-1; ++i) {
					arr[i][j] = (char)(65+step);
					step++;
					if (step>25) step = 0;
				}
			}else {
				for(int i=n-1; i>=0; --i) {
					arr[i][j] = (char)(65+step);
					step++;
					if (step>25) step = 0;
				}
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
