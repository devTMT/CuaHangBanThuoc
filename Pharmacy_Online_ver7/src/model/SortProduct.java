package model;

import java.util.TreeSet;

public interface SortProduct {
	
	public TreeSet<Product> sort_Ascending_PromationalPrice(String nameTypeProduct);
	public TreeSet<Product> sort_Descending_PromotionalPrice(String nameTypeProduct);
	public TreeSet<Product> sort_newProduct(String nameTypeProduct);
	
}
