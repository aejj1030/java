//숫자를 입력받아서 컴퓨터가 랜덤으로 뽑은 중복되지 않은 3가지 숫자 순서까지 를 맞춰라

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
			System.out.print("수를 입력 : ");
			int select[] = new int[3];
			for(int i=0; i<select.length; ++i) {
				select[i] = System.in.read() - 48;
				//한글자입력 System.in.read()는 아스키코드값으로 저장
				//그래서, 숫자를 입력받고자 한다면 0의 아스키코드값 48을 빼야 한다.
			}
			System.in.skip(5);//enter입력된 내용 버리기
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
		
		System.out.println(co+"번만에 맞추셨습니다.");
	}
}


















