package Java02;
//객체의 속성은 멤버 변수로, 객체의 기능은 메서드로 구현한다

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentHong = new Student();
		
		studentHong.studentID = 0712;
		studentHong.setStudentName("홍길동");
		studentHong.address = "조선";
		
		studentHong.showStudentInfo();
	}
}
