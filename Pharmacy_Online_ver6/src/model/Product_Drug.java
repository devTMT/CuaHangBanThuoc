package model;

public class Product_Drug extends Product {

	// thuốc không kê đơn
	public Product_Drug(String idProduct, String nameProduct, double price, double promotionalPrice, String nameNXS,
			String ThuongHieu, String function) {
		super(idProduct, nameProduct, price, promotionalPrice, nameNXS, ThuongHieu, function);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Drug [" + "getIdProduct()=" + getIdProduct() + ", getNameProduct()=" + getNameProduct()
				+ ", getPrice()=" + getPrice() + ", getPromotionalPrice()=" + getPromotionalPrice() + ", getNameNXS()="
				+ getNameNXS() + ", getThuongHieu()=" + getThuongHieu() + ", getFunction()=" + getFunction() + "]"
				+ "\n";
	}

}
