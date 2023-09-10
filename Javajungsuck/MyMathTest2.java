package Javajungsuck;

public class MyMathTest2 {
	public static void main(String args[]) {
		System.out.println(MyMath2.add(200L, 100L));	//클래스 메서드 호출
		MyMath2 mm = new MyMath2();	//인스턴스 생성
		
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());	//인스턴스 메서드 호출
	}
}
