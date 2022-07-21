package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.ListAccount;
import model.UserClient;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Color;

public class Panel_SuaThongTinCaNhan extends JPanel {
	
	int account = ListAccount.l_A.getList_Account().get(Frame_SignIn.accountRuntime).getPhoneNumber();
	UserClient userClient = (UserClient) ListAccount.l_A.getList_Account().get(account);
	private JTextField nameAccount;
	private JTextField address;
	private JTextField addressReceive;
	private JTextField emailAddress;
	private JLabel phoneNumber ;
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

//	private JLabel phoneNumber;

	/**
	 * Create the panel.
	 */
	public Panel_SuaThongTinCaNhan() {
		setForeground(Color.BLACK);
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

		JLabel addressField = new JLabel("Địa chỉ:");
		addressField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addressField.setBounds(68, 181, 169, 29);
		add(addressField);

		JLabel phoneNumberField = new JLabel("Số điện thoại:");
		phoneNumberField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		phoneNumberField.setBounds(68, 141, 169, 29);
		add(phoneNumberField);

		phoneNumber = new JLabel();
		phoneNumber.setText(String.valueOf(account));
		phoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		phoneNumber.setBounds(268, 141, 100, 29);
		add(phoneNumber);

		JLabel addressReceiveField = new JLabel("Địa chỉ nhận hàng:");
		addressReceiveField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addressReceiveField.setBounds(68, 220, 169, 29);
		add(addressReceiveField);

		nameAccount = new JTextField();
		nameAccount.setText(userClient.getName());
		nameAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameAccount.setBounds(268, 102, 235, 29);
		add(nameAccount);
		nameAccount.setColumns(10);

		address = new JTextField();
		address.setText(userClient.getAddress());
		address.setFont(new Font("Tahoma", Font.PLAIN, 16));
		address.setColumns(10);
		address.setBounds(268, 181, 489, 29);
		add(address);

		addressReceive = new JTextField();
		addressReceive.setText(userClient.getReceiveAddress());
		addressReceive.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addressReceive.setColumns(10);
		addressReceive.setBounds(268, 220, 489, 29);
		add(addressReceive);

		JLabel emailAddressField = new JLabel("Email:");
		emailAddressField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emailAddressField.setBounds(68, 259, 169, 29);
		add(emailAddressField);

		emailAddress = new JTextField();
		emailAddress.setText(userClient.getEmail());
		emailAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emailAddress.setBounds(268, 259, 489, 29);
		add(emailAddress);

		JLabel lblEmailVerify = new JLabel("Email không đúng, hãy nhập lại!");
		lblEmailVerify.setForeground(Color.RED);
		lblEmailVerify.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmailVerify.setBounds(268, 298, 489, 29);
		lblEmailVerify.setVisible(false);
		add(lblEmailVerify);
		
		JButton btnNewButton = new JButton("Lưu");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!emailAddress.getText().matches(EMAIL_PATTERN)) {
					lblEmailVerify.setVisible(true);
				}
				else {
					((UserClient) ListAccount.l_A.getList_Account().get(userClient.getPhoneNumber()))
							.setName(nameAccount.getText());
					((UserClient) ListAccount.l_A.getList_Account().get(userClient.getPhoneNumber()))
							.setAddress(address.getText());
					((UserClient) ListAccount.l_A.getList_Account().get(userClient.getPhoneNumber()))
							.setReceiveAddress(addressReceive.getText());
					((UserClient) ListAccount.l_A.getList_Account().get(userClient.getPhoneNumber()))
							.setEmail(emailAddress.getText());
					Frame_Home.panel_ThongTinCaNhan.updateData();
					Frame_Home.menuClicked(Frame_Home.panel_ThongTinCaNhan);
					ListAccount.l_A.update();
					lblEmailVerify.setVisible(false);
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(788, 48, 119, 21);
		add(btnNewButton);
		

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
	}
}
