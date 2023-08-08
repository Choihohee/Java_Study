package YoonJava;


public class StringClassEx{
	public static void main(String[] args) {
		String str = "ABCDE";
		char ch = str.charAt(3);
		String str2 = str.substring(1,4);
		String str3 = str.substring(1);
		String str4 = str.substring(1, str.length());
		System.out.println(str4);
		System.out.println(ch);
		
		String tmp = "자바를 공부하자";
		System.out.println(tmp.substring(4));
	}
}
