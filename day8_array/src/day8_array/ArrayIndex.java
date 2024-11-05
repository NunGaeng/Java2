package day8_array;

import java.util.*;

public class ArrayIndex {

	public static void main(String[] args) {
		// 배열 만들기
		//int nums[] = new int[3];
		//int[] nums = {2,3,4,5,7};
		Scanner scan =new Scanner(System.in);
		int nums[] = new int[10];
		int i=0;
		while(i<nums.length) {
			System.out.print("nums["+i+"]=");
			nums[i] = scan.nextInt();
			i++;
		}
		/*nums[0] = 10;
		nums[1] = 4;
		nums[2] = 6;*/
		for(i=0; i<nums.length; i++) {
			if(i%2==0) 
				continue;
			
			else
			System.out.println("nums["+i+"]="+nums[i]);
		}

	}

}
