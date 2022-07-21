package model;

import java.util.HashMap;
import java.util.Map;

public class Cart implements ICartModel {

	public static Cart cart= new Cart();
	private double valuePrice_before_Promotional; // tổng tiền trước khi khuyến mãi
	private double valuePrice_after_Promotional; // tổng tiền sau khi khuyến mãi
	private double valuePrice_Promotional; // tổng tiền khuyến mãi
	private Map<Product, Integer> product_in_cart = new HashMap<>();
	
	public Cart() {
	}
	
	public double getValuePrice_before_Promotional() {
		return valuePrice_before_Promotional;
	}

	public void setValuePrice_before_Promotional(double valuePrice_before_Promotional) {
		this.valuePrice_before_Promotional = valuePrice_before_Promotional;
	}

	public double getValuePrice_after_Promotional() {
		return valuePrice_after_Promotional;
	}

	public void setValuePrice_after_Promotional(double valuePrice_after_Promotional) {
		this.valuePrice_after_Promotional = valuePrice_after_Promotional;
	}

	public double getValuePrice_Promotional() {
		return valuePrice_Promotional;
	}

	public void setValuePrice_Promotional(double valuePrice_Promotional) {
		this.valuePrice_Promotional = valuePrice_Promotional;
	}

	public Map<Product, Integer> getProduct_in_cart() {
		return product_in_cart;
	}

	public void setProduct_in_cart(Map<Product, Integer> product_in_cart) {
		this.product_in_cart = product_in_cart;
	}

	@Override
	public void updateValuePrice() {
		valuePrice_before_Promotional = 0;
		valuePrice_after_Promotional = 0;
		valuePrice_Promotional = 0;

		for (Product p : product_in_cart.keySet()) {
			int quantity_of_one_product = product_in_cart.get(p); // lấy ra số lượng của sản phẩm đó trong giỏ hàng

			valuePrice_before_Promotional += p.getPrice() * quantity_of_one_product;
			valuePrice_after_Promotional += p.getPromotionalPrice() * quantity_of_one_product;
		}
		valuePrice_Promotional = valuePrice_before_Promotional - valuePrice_after_Promotional;
	}
}
