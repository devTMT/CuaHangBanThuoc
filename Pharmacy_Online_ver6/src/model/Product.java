package model;

import java.util.Comparator;
import java.util.Objects;

public class Product {

	private String idProduct, nameProduct;
	private double price;
	private double promotionalPrice;
	private String nameNXS;
	private String ThuongHieu;
	private String function; // công dụng

	
	
	public Product(String idProduct, String nameProduct, double price, double promotionalPrice, String nameNXS,
			String ThuongHieu, String function) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.price = price;
		this.promotionalPrice = promotionalPrice;
		this.nameNXS = nameNXS;
		this.ThuongHieu = ThuongHieu;
		this.function = function;
	}
	
	/*
	 * muốn so sánh các đối tượng Product với nhau
	 * cần sử dụng hàm hashCode và hàm equals
	 */
	@Override
	public int hashCode() {
		return Objects.hash(function, idProduct, nameNXS, nameProduct, ThuongHieu, price, promotionalPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(function, other.function) && Objects.equals(idProduct, other.idProduct)
				&& Objects.equals(nameNXS, other.nameNXS) && Objects.equals(nameProduct, other.nameProduct)
				&& Objects.equals(ThuongHieu, other.ThuongHieu)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(promotionalPrice) == Double.doubleToLongBits(other.promotionalPrice);
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPromotionalPrice() {
		return promotionalPrice;
	}

	public void setPromotionalPrice(double promotionalPrice) {
		this.promotionalPrice = promotionalPrice;
	}

	public String getNameNXS() {
		return nameNXS;
	}

	public void setNameNXS(String nameNXS) {
		this.nameNXS = nameNXS;
	}

	public String getThuongHieu() {
		return ThuongHieu;
	}

	public void setThuongHieu(String name_ThuongHieu) {
		this.ThuongHieu = name_ThuongHieu;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", price=" + price
				+ ", promotionalPrice=" + promotionalPrice + ", nameNXS=" + nameNXS + ", ThuongHieu=" + ThuongHieu
				+ ", function=" + function + "]"+"\n";
	}

	

}

class Sort_Ascending_PromotionalPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		/*
		 * nếu >= mà return số dương thì tăng dần
		 */

		int result = 0;
		if (o1.getPromotionalPrice() >= o2.getPromotionalPrice()) {
			result = 1;
		} else {
			result = -1;
		}

		return result;

	}

}

class Sort_Descending_PromotionalPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		/*
		 * nếu >= mà return số âm thì giảm dần
		 */
		int result = 0;
		if (o1.getPromotionalPrice() >= o2.getPromotionalPrice()) {
			result = -1;
		} else {
			result = 1;
		}

		return result;

	}

}
