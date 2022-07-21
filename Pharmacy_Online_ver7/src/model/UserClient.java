package model;

public class UserClient extends User {

	private String receiveAddress; // địa chỉ nhận hàng
	
	public UserClient(String name, String address, Integer phoneNumber, String email, String password,
			String receiveAddress) {
		super(name, address, phoneNumber, email, password);
		this.receiveAddress = receiveAddress;
	}

	public String getReceiveAddress() {
		return receiveAddress;
	}

	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}
}
