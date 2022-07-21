package test;

import model.ListProduct;

public class Test_ListProduct_2 {

	public static void main(String[] args) {

		for (String s : ListProduct.l_Product.getListProducts_byName().keySet()) {

			System.out.println(s + "\n" + ListProduct.l_Product.search_Products_byNameType(s));
			System.out.println("------------------------------------------------------");
		}
	}

}
