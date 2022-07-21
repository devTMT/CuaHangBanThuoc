package controller;

import model.IListAccount;


public class Adapter implements IAdapter {

	private IListAccount l_A;

	public Adapter(IListAccount listAccount) {

		this.l_A = listAccount;

	};

	@Override
	public String register(String phoneNumber, String password_1, String password_2) {
		// TODO Auto-generated method stub
		return l_A.register(phoneNumber, password_1, password_2);
	}

	@Override
	public String signIn(String phoneNumber, String password) {
		// TODO Auto-generated method stub
		return l_A.signIn(phoneNumber, password);
	}

}
