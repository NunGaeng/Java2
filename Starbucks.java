package day8_array;

public class Starbucks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] coffee = new int[7];
		//coffee[0] =12;
		int[] coffee = {12,33,44,100,66,77,55};
		//총 판매잔을 출력하시오
		int sum = coffee[0]+coffee[1]+coffee[2]+coffee[3]+coffee[4]+coffee[5]+coffee[6];
		sum = 0;
		for(int i=0; i<coffee.length; i++) {
			sum=sum+coffee[i];
		}
		System.out.println("sum = "+sum+"잔");
		
		//판매 금액을 출력하시오. 한잔당 2000원으로 계산
		sum = sum*2000;
		System.out.println("금액 = "+sum+"원");
	}

}
