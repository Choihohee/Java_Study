package NamgungsungJava;

public class FisherYatesShuffleAlgorism {
	 public static void main(String[] args) {
		 int[] numArr = new int[10];
		 
		 for(int i=0; i<numArr.length; i++) {
			 numArr[i] = i;
			 System.out.print(numArr[i]);
		 }
		 System.out.println();
		 for(int i=0; i<100; i++) {	//섞기 작업을 100번 수행합니다.
		 	int n = (int)(Math.random()*10);
		 	//Math.random()는 0과 1사이의 난수이므로 10을 곱함
		 	int tmp = numArr[0];
		 	numArr[0] = numArr[n];
		 	numArr[n] = tmp;
		 }
		 for(int i=0; i<numArr.length; i++) {
			 System.out.print(numArr[i]);
		 }
	 }
}
