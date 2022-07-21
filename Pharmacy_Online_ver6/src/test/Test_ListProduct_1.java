package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import model.ListProduct;
import model.Product;
import model.Product_Drug;

public class Test_ListProduct_1 {

	public static void main(String[] args) {

		Product p1 = new Product_Drug("1", "abc1", 100, 99.8, "nlu", "1", "chua benh");
		Product p2 = new Product_Drug("2", "abc2", 112, 89, "nlu", "1", "chua benh");
		Product p3 = new Product_Drug("3", "abc3", 300, 80, "nlu", "1", "chua benh");
		Product p4 = new Product_Drug("4", "abc4", 120, 120, "nlu", "1", "chua benh");
		Product p5 = new Product_Drug("5", "abc5", 150, 120, "nlu", "1", "chua benh");
		Product p6 = new Product_Drug("6", "abc6", 400, 300, "nlu", "1", "chua benh");
		Product p7 = new Product_Drug("7", "abc7", 500, 300.9, "nlu", "1", "chua benh");
		Product p8 = new Product_Drug("8", "abc8", 600, 580.9, "nlu", "1", "chua benh");
		Product p9 = new Product_Drug("9", "abc9", 1000, 590, "nlu", "1", "chua benh");
		Product p10 = new Product_Drug("10", "abc10", 50, 50, "nlu", "1", "chua benh");

		Product[] arr = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 };

		Set<Product> setProduct = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {

			setProduct.add(arr[i]);
		}

		Map<String, Set<Product>> map = new HashMap<>();
		map.put("Thuoc ke don", setProduct);
		map.put("Thuoc khong ke don", setProduct);
		ListProduct listProducts = new ListProduct(map);

		System.out.println(setProduct);
		System.out.println("-----------------------------");

		System.out.println("Danh sách các loaị thuốc kê đơn \n"
				+ listProducts.getListProducts_byName().containsKey("Thuoc ke don"));
		System.out.println(listProducts.getListProducts_byName().get("Thuoc ke don"));

		System.out.println("Danh sách các loại thuốc không kê đơn \n"
				+ listProducts.getListProducts_byName().containsKey("Thuoc 0 ke don"));
		System.out.println(listProducts.getListProducts_byName().get("Thuoc 0 ke don"));

		System.out.println("-----------------------------");
		System.out.println("Sắp xếp sản phẩm theo thứ tự tăng dần về giá khuyến mãi :\n"
				+ listProducts.sort_Ascending_PromationalPrice("Thuoc ke don"));

		System.out.println("-----------------------------");
		System.out.println("Sắp xếp sản phẩm theo thứ tự giảm dần về giá khuyến mãi :\n"
				+ listProducts.sort_Descending_PromotionalPrice("Thuoc khong ke don"));

		System.out.println("-----------------------------");
		System.out.println(listProducts.search_Products_byNameType("Thuoc ke don"));
		System.out.println(listProducts.search_Products_byNameType("Thuoc khong ke don"));

	}

}
