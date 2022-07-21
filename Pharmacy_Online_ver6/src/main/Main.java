package main;

import java.awt.EventQueue;

import controller.Adapter;
import controller.IAdapter;
import model.IListAccount;
import model.ListAccount;
import view.Frame_SignIn;

public class Main {

	public static void main(String[] args) {
		
		
		IAdapter controller = new Adapter(ListAccount.l_A);
		Frame_SignIn fr_DangNhap = new Frame_SignIn(controller);
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fr_DangNhap.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
