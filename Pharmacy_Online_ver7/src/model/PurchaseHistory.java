package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import view.Frame_SignIn;

public class PurchaseHistory {
	public static PurchaseHistory listBill = new PurchaseHistory();
	private Map<Integer, ArrayList<Bill>> bills;
	private static int idBillNotGrantedYet = 1;

	public PurchaseHistory() {
		this.bills = new HashMap<Integer, ArrayList<Bill>>();
	}

	public Map<Integer, ArrayList<Bill>> getBills() {
		return bills;
	}

	public void addBill(Bill bill) {
		ArrayList<Bill> bills = new ArrayList<Bill>();
		bills.add(bill);
		if (!listBill.getBills().containsKey(Frame_SignIn.accountRuntime)) {
			listBill.getBills().put(Frame_SignIn.accountRuntime, bills);
		} else {
			PurchaseHistory.listBill.getBills().get(Frame_SignIn.accountRuntime).add(bill);
		}

		Cart.cart = new Cart();
	}
	
	// Lấy ra mã đơn hàng chưa cấp
	public static int getIdBillNotGrantedYet() {
		return idBillNotGrantedYet++;
	}
}
