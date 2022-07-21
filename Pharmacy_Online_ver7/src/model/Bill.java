package model;

import java.util.GregorianCalendar;

public class Bill {
	private int idBill;
	private GregorianCalendar dateBill;
	private GregorianCalendar dateDelivery;
	private double costShip;
	private Cart cart;
	
	public Bill( Cart cart) {
		this.idBill = PurchaseHistory.getIdBillNotGrantedYet();
		this.dateBill = new GregorianCalendar();
		this.dateDelivery = new GregorianCalendar();
		// Điều kiện, nếu đặt hàng trước 7h sáng hoặc sau 20h thì giao hàng được giao vào ngày sau
		if (dateBill.get(GregorianCalendar.HOUR_OF_DAY) > 20 || dateBill.get(GregorianCalendar.HOUR_OF_DAY) < 7) {
			this.dateDelivery.add(GregorianCalendar.DAY_OF_MONTH, 1);
		}else {
			this.dateDelivery.add(GregorianCalendar.DAY_OF_MONTH, 0);
		}
		this.cart = cart;
		this.costShip = 30000;
	}
	
	public double totalValuePriceBill() {
		return cart.getValuePrice_after_Promotional() + costShip;
	}
	
	public int getIdBill() {
		return idBill;
	}

	public GregorianCalendar getDateBill() {
		return dateBill;
	}
	public GregorianCalendar getDateDelivery() {
		return dateDelivery;
	}
	public double getCostShip() {
		return costShip;
	}
	public Cart getCart() {
		return cart;
	}
	
}
