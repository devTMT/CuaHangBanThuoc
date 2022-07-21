package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class ListAccount implements Serializable, IListAccount {
	
	public static ListAccount l_A = new ListAccount();
	/*
	 * key : số điện thoại đồng thời cũng là tên tài khoản value : mật khẩu
	 */
	private Map<Integer, User> list_Account = new HashMap<>();
	private static final String filepath = "data/listAccount.dat";

	public ListAccount() {
		if (readData() == null) {
			User u_1 = new UserClient("Tran Minh Tuyen", "NLU", 20130459, "20130459@st.hcmuaf.edu.vn", "123456789@", "NLU_1");
			User u_2 = new UserClient("Dang The Vu", "NLU", 123, "20130465@st.hcmuaf.edu.vn", "123", "NLU_2");
			User u_3 = new UserClient("Nguyen Thuy Linh", "NLU", 20130307, "20130307@st.hcmuaf.edu.vn", "123456789@",
					"NLU_3");

			list_Account.put(20130459, u_1);
			list_Account.put(123, u_2);
			list_Account.put(20130307, u_3);
			updateData(l_A);
		} else {
			this.list_Account = readData().getList_Account();
		}

	}

	public void update() {
		updateData(l_A);
	}

	public void updateData(Object obj) {
		try {
			FileOutputStream fileOut = new FileOutputStream(filepath);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(obj);
			objectOut.close();
			System.out.println("The Object  was succesfully written to a file");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public ListAccount readData() {
		ListAccount data = null;
		try {
			FileInputStream fis = new FileInputStream(filepath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			data = (ListAccount) ois.readObject();
			ois.close();
			System.out.println("The Object  was succesfully read from a file");
		} catch (Exception ex) {
			System.out.println("Loi doc file: " + ex);
		}
		return data;
	}

	public Map<Integer, User> getList_Account() {
		return list_Account;
	}

	public void setList_Account(Map<Integer, User> list_Account) {
		this.list_Account = list_Account;
	}

	public static ListAccount getL_A() {
		return l_A;
	}

	public static void setL_A(ListAccount l_A) {
		ListAccount.l_A = l_A;
	}


	@Override
	public String register(String phoneNumber, String password_1, String password_2) {
		// TODO Auto-generated method stub

		String result = "";
		try {

			Integer phone_Number = Integer.parseInt(phoneNumber);

			if (list_Account.containsKey(phone_Number)) {
				result = "Taì khoản đã tồn tại";
			} else {
				if (password_1.equals(password_2)) {

					result = "Chúc mừng bạn đã đăng kí thành công ,xin vui lòng đăng nhập lại";
					User user = new UserClient("", "", phone_Number, "", password_2, "");
					list_Account.put(phone_Number, user);
					updateData(l_A);

				} else {
					result = "Xin vui lòng nhập lại mật khẩu";
				}
			}
		} catch (Exception e) {
			System.out.println("Số điện thoại của bạn không đúng , xin vui lòng nhập lại !!!");
		}

		return result;
	}

	@Override
	public String signIn(String phoneNumber, String password) {
		// TODO Auto-generated method stub
		String result = "";
		try {

			Integer phone_Number = Integer.parseInt(phoneNumber);
			if (list_Account.containsKey(phone_Number)) {

				if (list_Account.get(phone_Number).getPassword().equals(password)) {

					result = "Bạn đã đăng nhập thành công vào hệ thống ^.^";

				} else {

					result = "Mật khẩu của bạn không đúng , xin vui lòng đăng nhập lại";
				}

			} else {

				result = "Bạn chưa có tài khoản , xin vui lòng đăng kí !!!";

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Số điện thoại của bạn không đúng , xin vui lòng nhập lại !!!");
		}

		return result;

	}

}
