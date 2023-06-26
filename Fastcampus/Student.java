package Java02;


public class Student {
	
	public int studentID;	//학번
	public String studentName;	//이름
	public String address;	//주소
	
	public void showStudentInfo() {
		System.out.println("이 학생의 학번은 " + studentID + 
				"이고, 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
	}
	/*public String getStudentName() {
		return studentName;
	}*/
	public void setStudentName(String name) {
		studentName = name;
	}
}