package model;

import java.util.Date;

public class UserPharmacist extends User {

	private String idPracticeCertificate; // mã chứng chỉ hành nghề
	private Date birthDay; // ngày sinh

	public UserPharmacist(String name, String address, Integer phoneNumber, String email, String password,
			String idPracticeCertificate, Date birthDay) {
		super(name, address, phoneNumber, email, password);
		this.idPracticeCertificate = idPracticeCertificate;
		this.birthDay = birthDay;
	}


}
