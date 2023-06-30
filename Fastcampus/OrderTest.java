package FastCampusJava02;

public class OrderTest {
	public static void main(String[] args) {
	OrderInfo Maratang = new OrderInfo();
	
	Maratang.orderNumber = "202011020003"; 
	Maratang.phoneNumber = "01023450001";
	Maratang.Address = "서울시 강남구 역삼동 111-333";
	Maratang.orderDate = "20201102";
	Maratang.orderTime = "130258";
	Maratang.orderPrice = "35000";
	Maratang.MenuNumber = "0003";
	
	System.out.println(Maratang.showOrderInfo());
	}
}
