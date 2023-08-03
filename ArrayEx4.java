package YoonJava;

import java.util.Arrays;

public class ArrayEx4 {
	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc와 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//number의 인데스 6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
		//random 메소드 호출
		ArrayEx4 ex5_4 = new ArrayEx4();
		ex5_4.random();
	}
	 void random() {
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<10; i++) {
			int n = (int)(Math.random() * 10);
			int tmp =numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
			System.out.println(Arrays.toString(numArr));
		}
	}
	
}