package day8_array;

public class ArrayString {

	public static void main(String[] args) {
		// 문자열 배열 만들기
		int arr[] = {1,2,3};
		String[] games = {"starcraft","리니지","EternalReturn"};
		System.out.print("게임이름:");
		for(int i=0; i<games.length; i++) {
			System.out.print(games[i]+ " ");
		}
		System.out.println("");
		System.out.print("등수:");
		for(int i=0; i<arr.length; i++) {
			System.out.print("      "+arr[i]+" ");
		}
		//예제
		System.out.println("");
		String[] strArr = {"프로그래밍","완전","너무","싫어","노는게","좋아요","별로"};
		System.out.printf("%s, %s %s!", strArr[0], strArr[1], strArr[5]);
	}

}
