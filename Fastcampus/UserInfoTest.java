package FastCampusJava02;
//여러가지 생성자를 정의하는 생성자 오버로딩
public class UserInfoTest {
	public static void main(String[] args) {
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassWord = "zxcvbn12345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01012345678";
		userLee.userAddress = "Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kin");
		System.out.println(userKim.showUserInfo());
	}
}
