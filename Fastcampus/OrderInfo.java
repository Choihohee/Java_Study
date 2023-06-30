package FastCampusJava02;
//음식점에 배달 주문이 들어왔습니다.
public class OrderInfo {
	public String orderNumber;
	public String phoneNumber;
	public String Address;
	public String orderDate;
	public String orderTime;
	public String orderPrice;
	public String MenuNumber;

	public OrderInfo() {}
	
	public OrderInfo(String orderNumber, String phoneNumber, String Address, 
			String orderDate, String orderTime, String orderPrice, String MenuNumber) {
		this.orderNumber = orderNumber; 
		this.phoneNumber = phoneNumber;
		this.Address = Address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.MenuNumber = MenuNumber;
	}
	
	public String showOrderInfo() {
		System.out.println("배달의 민족 주문~!");
		return "주문 접수 번호: " +orderNumber +('\n')+ "핸드폰 번호: " +phoneNumber+('\n')
				+ "주소: " +Address+('\n')+ "주문날짜: " +orderDate+('\n')+"주문시간: " + orderTime +('\n') 
				+ "가격: " +orderPrice+('\n')+ "메뉴번호: " + MenuNumber;
	}
}
