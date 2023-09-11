package Ex6_29;

class TestClass {
	void instanceMethod()	{}//인스턴스 메서드
	static void staticMethod()	{}//static메서드
	
	void instatnceMethod2() {	//인스턴스 메서드
		instanceMethod();	//다른 인스턴스 메서드를 호출
		staticMethod();	//static메서드를 호출	
	}
	
	static void staticMethod2()	{//static메서드
		insatanceMethod();	//에러!!! 인스턴스 메서를 호출 할 수 없음
		staticMethod();	//static 메서드는 호출 가능
	}
}
//static메서드 -> 인스턴스 메서드	호출O
//static메서드 <- 인스턴스 메서드	호출X