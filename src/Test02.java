//���ڸ� �Է¹޾Ƽ� ��ǻ�Ͱ� �������� ���� �ߺ����� ���� 3���� ���� �������� �� �����

import java.io.*;

public class Test02 {
	public static void main(String[] args) throws IOException {
		
		int com[] = new int[3];
		for(int i=0; i<com.length; ++i) {
			com[i] = (int)(Math.random()*9) + 1;
			for(int j=0; j<i; ++j) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		
		int co = 0;
		while(true) {
			System.out.print("���� �Է� : ");
			int select[] = new int[3];
			for(int i=0; i<select.length; ++i) {
				select[i] = System.in.read() - 48;
				//�ѱ����Է� System.in.read()�� �ƽ�Ű�ڵ尪���� ����
				//�׷���, ���ڸ� �Է¹ް��� �Ѵٸ� 0�� �ƽ�Ű�ڵ尪 48�� ���� �Ѵ�.
			}
			System.in.skip(5);//enter�Էµ� ���� ������
			co++;
			int strike = 0, ball = 0;
			for(int i=0; i<com.length; ++i) {
				for (int j=0; j<select.length; ++j) {
					if (com[i] == select[j]) {
						if (i==j) {
							strike++;
						}else {
							ball++;
						}
					}
				}
			}
			
			if (strike==0 && ball==0) {
				System.out.println("out");
			}else if (strike==3) {
				break;
			}else {
				System.out.printf("%dS %dB\n", strike, ball);
			}
		}
		
		System.out.println(co+"������ ���߼̽��ϴ�.");
	}
}


















