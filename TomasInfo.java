package FastCampusJava02;

public class TomasInfo {
	public String height;
	public String weight;
	public String age;
	public String Name;
	
	public TomasInfo() {}
	
	public TomasInfo(String height, String weight, String age, String Name) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.Name = Name;
	}
	
	public String showTomasInfo() {
		return "키가 " +height+ "이고 몸무게가 " +weight+ 
				"킬로인 남성이 있습니다. 이름은 " +Name+ "이고 나이는 " +age+ "입니다.";
	}
}
