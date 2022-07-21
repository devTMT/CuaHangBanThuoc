package model;

import java.util.Objects;

public class Pharmacy {

	private String idPharmacy, namePharmacy, phoneNumber, address;

	public Pharmacy(String idPharmacy, String namePharmacy, String phoneNumber, String address) {
		super();
		this.idPharmacy = idPharmacy;
		this.namePharmacy = namePharmacy;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	/*
	 * muốn so sánh các đối tượng Pharmacy với nhau cần sử dụng hàm hashCode and equals
	 */

	@Override
	public int hashCode() {
		return Objects.hash(address, idPharmacy, namePharmacy, phoneNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pharmacy other = (Pharmacy) obj;
		return Objects.equals(address, other.address) && Objects.equals(idPharmacy, other.idPharmacy)
				&& Objects.equals(namePharmacy, other.namePharmacy) && Objects.equals(phoneNumber, other.phoneNumber);
	}


	public String getIdPharmacy() {
		return idPharmacy;
	}

	public void setIdPharmacy(String idPharmacy) {
		this.idPharmacy = idPharmacy;
	}

	public String getNamePharmacy() {
		return namePharmacy;
	}

	public void setNamePharmacy(String namePharmacy) {
		this.namePharmacy = namePharmacy;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Pharmacy [idPharmacy=" + idPharmacy + ", namePharmacy=" + namePharmacy + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]"+"\n";
	}

}
