/* 1	2	3	4	5
 * 10	9	8	7	6
 * 11	12	13	14	15
 * 20	19	18	17	16
 * 21	22	23	24	25
 */
public class Test01 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int co = 1; //1-25���� �����Ұ�
		int i = 0;
		//i%2 == 0 �� ¦�� i%2 == 1�� Ȧ��
		while(true) {
			if (i%2==0) {
				for(int j=0; j<=4; ++j) {
					arr[i][j] = co;
					co++;
				}
			}else {
				for(int j=4; j>=0; --j) {
					arr[i][j] = co;
					co++;
				}
			}
			i++;
			if (i>4) break;
		}
		//��¹�
		
		for(i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
