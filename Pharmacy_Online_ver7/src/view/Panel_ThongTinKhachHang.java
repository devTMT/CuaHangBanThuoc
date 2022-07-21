package view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.ListAccount;
import model.UserClient;

public class Panel_ThongTinKhachHang extends JPanel {
	
	int account = ListAccount.l_A.getList_Account().get(Frame_SignIn.accountRuntime).getPhoneNumber();
	UserClient userClient = (UserClient) ListAccount.l_A.getList_Account().get(account);
	private JLabel nameAccount;
	private JLabel address;
	private JLabel phoneNumber;
	private JLabel addressReceive;
	private JLabel emailAddress;

	/**
	 * Create the panel.
	 */
	public Panel_ThongTinKhachHang() {
		setBounds(0, 0, 950, 623);
		setLayout(null);

		JLabel accountInfo = new JLabel("Thông tin tài khoản");
		accountInfo.setHorizontalAlignment(SwingConstants.CENTER);
		accountInfo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		accountInfo.setBounds(373, 31, 204, 50);
		add(accountInfo);

		JLabel nameField = new JLabel("Họ và tên:");
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameField.setBounds(68, 102, 169, 29);
		add(nameField);

		nameAccount = new JLabel();
		nameAccount.setText(userClient.getName());
		nameAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameAccount.setBounds(268, 102, 567, 29);
		add(nameAccount);

		JLabel addressField = new JLabel("Địa chỉ:");
		addressField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addressField.setBounds(68, 181, 169, 29);
		add(addressField);

		address = new JLabel();
		address.setText(userClient.getAddress());
		address.setFont(new Font("Tahoma", Font.PLAIN, 16));
		address.setBounds(268, 181, 567, 29);
		add(address);

		JLabel phoneNumberField = new JLabel("Số điện thoại:");
		phoneNumberField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		phoneNumberField.setBounds(68, 141, 169, 29);
		add(phoneNumberField);

		phoneNumber = new JLabel();
		phoneNumber.setText(String.valueOf(userClient.getPhoneNumber()));
		phoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		phoneNumber.setBounds(268, 141, 174, 29);
		add(phoneNumber);

		JLabel addressReceiveField = new JLabel("Địa chỉ nhận hàng:");
		addressReceiveField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addressReceiveField.setBounds(68, 220, 169, 29);
		add(addressReceiveField);

		addressReceive = new JLabel();
		addressReceive.setText(userClient.getReceiveAddress());
		addressReceive.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addressReceive.setBounds(268, 220, 567, 29);
		add(addressReceive);

		JButton btnNewButton = new JButton("Chỉnh sửa");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Frame_Home.menuClicked(Frame_Home.panel_SuaThongTinCaNhan);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(788, 48, 119, 21);
		add(btnNewButton);
		
		JLabel emailAddressField = new JLabel("Email:");
		emailAddressField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emailAddressField.setBounds(68, 259, 169, 29);
		add(emailAddressField);
		
		emailAddress = new JLabel();
		emailAddress.setText(userClient.getEmail());
		emailAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emailAddress.setBounds(268, 259, 567, 29);
		add(emailAddress);
		setVisible(true);

	}
	
	public void updateData() {
		account = ListAccount.l_A.getList_Account().get(Frame_SignIn.accountRuntime).getPhoneNumber();
		userClient = (UserClient) ListAccount.l_A.getList_Account().get(account);
		nameAccount.setText(userClient.getName());
		address.setText(userClient.getAddress());
		phoneNumber.setText(String.valueOf(userClient.getPhoneNumber()));
		addressReceive.setText(userClient.getReceiveAddress());
		emailAddress.setText(userClient.getEmail());
		Frame_Home.panel_SuaThongTinCaNhan.updateData();
	}
}
