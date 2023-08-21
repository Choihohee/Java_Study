package NamgungsungJava;

class Tv {
	//채널, 음량, 전원 멤버변수
	boolean power;
	int channel;
	int sound;
	
	//기능 메소드
	void power() {	power = !power;	}
	void channelUp() {	channel++;	}
	void channelDown() {	channel--;	}
	void soundUp() {	sound++;	}
	void soundDown() {	sound--;	}
}

class AC {
	//온도, 바람세기, 전원 멤버변수
	boolean power;
	int temp;	//온도
	int windlevel;
	
	//기능 메소드
	void power() {	power = !power;	}
	void tempUp() {	temp++;	}
	void tempDown() {	temp--;	}
	void windlevelUp() {	windlevel++;	}
	void windlevelDown() {	windlevel--;	}
}

public class HomeElectronicsTest {
	public static void main(String[] args) {
		Tv lgTv;
		lgTv = new Tv();
		Tv samsungTv;
		samsungTv = new Tv();
		
		AC xiaomiAc;
		xiaomiAc = new AC();
		
		lgTv.sound = 15;
		lgTv.soundUp();
		
		samsungTv.channel = 37;		
		samsungTv.channelDown();
		samsungTv.channelDown();
		samsungTv.channelDown();
		samsungTv.channelDown();
		
		
		System.out.println("기가지니, LG 티비 지금 음량 몇이야?");
		System.out.println("기가지니:" + lgTv.sound + " 입니다.");
		System.out.println("기가지니, 삼성 티비 채널 번호 알려줘");
		System.out.println("기가지니:" + samsungTv.channel + " 번 입니다.");
		
		
//		void power() {	power = !power;	}
//		void tempUp() {	temp++;	}
//		void tempDown() {	temp--;	}
//		void windlevelUp() {	windlevel++;	}
//		void windlevelDown() {	windlevel--;	}
		xiaomiAc.temp = 25;
		xiaomiAc.tempDown();
		
		System.out.println("샤오미 에어컨 온도 몇이야?");
		
	}
}
