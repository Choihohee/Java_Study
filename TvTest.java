package NamgungsungJava;

class Tv{
	//멤버변수(속성)
	String color;
	boolean onoff;
	int channel;
	
	//메소드(기능)
	void onoff() {
		onoff = !onoff;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}

public class TvTest { 
	public static void main(String[] args) { 
		//인스턴스 생성
		Tv t;
		t = new Tv();
		t.channel=10;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "번 입니다.");
		
	}
}