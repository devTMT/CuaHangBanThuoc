package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import controller.IAdapter;
import model.ListAccount;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frame_Register extends JFrame {

	private JPanel contentPane;
	private JTextField text_phoneNumber;
	private JPasswordField text_pass_1;
	private JPasswordField text_pass_2;
	private JRootPane rootPane;
	
	private IAdapter modelAdapter;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Frame_Register frame = new Frame_Register();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Frame_Register(IAdapter iModelAdapter) {
		setResizable(false);
		setFont(new Font("Arial", Font.PLAIN, 20));
		setTitle("Đăng kí ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(275, 100, 742, 522);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label_phoneNumber = new JLabel("Số điện thoại của bạn:");
		label_phoneNumber.setForeground(new Color(0, 0, 255));
		label_phoneNumber.setBounds(32, 54, 131, 37);
		contentPane.add(label_phoneNumber);

		JLabel label_DangKi = DefaultComponentFactory.getInstance().createLabel("Đăng kí");
		label_DangKi.setForeground(new Color(0, 0, 128));
		label_DangKi.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_DangKi.setBounds(307, 11, 146, 40);
		contentPane.add(label_DangKi);

		JLabel label_pass_1 = new JLabel("Mật khẩu:");
		label_pass_1.setForeground(new Color(0, 0, 255));
		label_pass_1.setBounds(32, 102, 103, 14);
		contentPane.add(label_pass_1);

		JLabel label_pass_2 = new JLabel("Nhập lại mật khẩu:");
		label_pass_2.setForeground(new Color(0, 0, 255));
		label_pass_2.setBounds(32, 141, 122, 14);
		contentPane.add(label_pass_2);

		text_phoneNumber = new JTextField(); // nhập số điện thoại ở đây
		text_phoneNumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {

					e.consume(); // if it's not a number, ignore the event
				}
			}
		});
		text_phoneNumber.setBounds(201, 62, 252, 20);
		contentPane.add(text_phoneNumber);
		text_phoneNumber.setColumns(10);

		JCheckBox checkBox_showPass = new JCheckBox("Hiện mật khẩu");
		checkBox_showPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (checkBox_showPass.isSelected()) {

					text_pass_1.setEchoChar((char) 0);
					text_pass_2.setEchoChar((char) 0);
				} else {

					text_pass_1.setEchoChar('•');
					text_pass_2.setEchoChar('•');

				}
			}
		});
		checkBox_showPass.setBounds(342, 165, 111, 23);
		contentPane.add(checkBox_showPass);

		JButton button_register = new JButton("Đăng kí");
		button_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String sdt = text_phoneNumber.getText();
				String pass_1 = text_pass_1.getText();
				String pass_2 = text_pass_2.getText();

				if (sdt.length() == 0 || pass_2.length() == 0 || pass_2.length() == 0) {

					JOptionPane.showMessageDialog(rootPane, "Thông tin của bạn còn thiếu, hãy điền đầy đủ !!!");
				} 
				
				else if (pass_1.equals(pass_2)) {

					String text = modelAdapter.register(sdt, pass_1, pass_2);

					switch (text) {
					case "Taì khoản đã tồn tại": {

						JOptionPane.showMessageDialog(rootPane, text);
						text_phoneNumber.setText("");
						text_pass_1.setText("");
						text_pass_2.setText("");
						break;
					}
					case "Chúc mừng bạn đã đăng kí thành công ,xin vui lòng đăng nhập lại": {

						JOptionPane.showMessageDialog(rootPane, text);
						Frame_SignIn f = new Frame_SignIn(modelAdapter);
						f.show();
						dispose();
						break;
					}
					case "Xin vui lòng nhập lại mật khẩu": {
						
						JOptionPane.showMessageDialog(rootPane, text);
						break;
						
					}

					default:
						throw new IllegalArgumentException("Unexpected value: " + text);
					}
				}
				
				else {

					JOptionPane.showMessageDialog(rootPane,
							"Mật khẩu của bạn không trùng khớp với nhau, vui lòng kiểm tra lại !!!");
					
				}

			}
		});
		button_register.setBackground(new Color(0, 128, 0));
		button_register.setForeground(new Color(255, 255, 255));
		button_register.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_register.setBounds(201, 233, 336, 51);
		contentPane.add(button_register);

		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance()
				.createLabel("Bạn đã có tài khoản T - kun ^.^");
		lblNewJgoodiesLabel_1.setBounds(282, 295, 179, 14);
		contentPane.add(lblNewJgoodiesLabel_1);

		JButton button_signIn = new JButton("Đăng nhập ngay");
		button_signIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Frame_SignIn s = new Frame_SignIn(modelAdapter);

				s.show();

				dispose();
			}
		});
		button_signIn.setBackground(new Color(100, 149, 237));
		button_signIn.setForeground(new Color(255, 255, 255));
		button_signIn.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_signIn.setBounds(282, 320, 171, 40);
		contentPane.add(button_signIn);

		text_pass_1 = new JPasswordField();
		text_pass_1.setBounds(201, 99, 252, 20);
		contentPane.add(text_pass_1);

		text_pass_2 = new JPasswordField();
		text_pass_2.setBounds(201, 138, 252, 20);
		contentPane.add(text_pass_2);
		
		this.modelAdapter= iModelAdapter;
	}
}
