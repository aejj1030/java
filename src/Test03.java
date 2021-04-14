import java.util.*;

public class Test03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n의 값을 입력 : ");
		int n = in.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int arr3[] = new int[n];
		//int maxSu = 1;		
		//for(int i=1; i<=n; ++i) {
		//	maxSu *= 2;	
		//}
		for(int i=0; i<n; ++i) {
			//arr1[i] = (int)(Math.random()*maxSu);
			System.out.print("arr1의 값을 입력 : ");
			arr1[i] = in.nextInt();
		}
		for(int i=0; i<n; ++i) {
			//arr2[i] = (int)(Math.random()*maxSu);
			System.out.print("arr2의 값을 입력 : ");
			arr2[i] = in.nextInt();
		}
		for(int i=0; i<n; ++i) {
			arr3[i] = arr1[i] | arr2[i];
		}
		
		for(int i=0; i<n; ++i) {
			String binary = "";
			int su = arr3[i];
			while(su>0) {
				//binary = (su%2==0 ? " " : "#") + binary;
				if (su%2 == 0) {
					binary = " " + binary;
				}else {
					binary = "#" + binary;
				}
				su /= 2;
			}
			System.out.println(binary);
		}
	}
}











