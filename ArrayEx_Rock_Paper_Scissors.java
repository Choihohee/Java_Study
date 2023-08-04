package YoonJava;

import java.util.Arrays;

public class ArrayEx_Rock_Paper_Scissors{
	public static void main(String[] args) {
		System.out.println("0 = 가위, 1 = 바위, 2 = 보");
		
		String[] strArr = { "가위", "바위", "보" };
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0; i<10; i++) {
			System.out.print((int)(Math.random()*3));//0~2 0은 가위 1은 바위 2는 보
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			char tmp = ((char)(Math.random()*3));
			System.out.print(strArr[tmp]);
		}
	}
}
