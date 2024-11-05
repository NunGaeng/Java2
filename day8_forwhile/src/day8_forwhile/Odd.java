package day8_forwhile;

public class Odd {

	public static void main(String[] args) {
		// while문으로 1~10까지의 홀수만 출력하시오
		int i = 1;
		while(i<=10) {
			if(i%2!=0)
				System.out.println(i);
				i++;
		}

	}
	
}
