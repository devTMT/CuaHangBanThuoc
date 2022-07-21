package model;

public class UserShipper extends User {

	private String licensePlater; // biển số xe
	private String vehicle; // tên phương tiện

	public UserShipper(String name, String address, Integer phoneNumber, String email, String password,
			String licensePlater, String vehicle) {
		super(name, address, phoneNumber, email, password);
		this.licensePlater = licensePlater;
		this.vehicle = vehicle;
	}

	public String getLicensePlater() {
		return licensePlater;
	}

	public void setLicensePlater(String licensePlater) {
		this.licensePlater = licensePlater;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}


}
