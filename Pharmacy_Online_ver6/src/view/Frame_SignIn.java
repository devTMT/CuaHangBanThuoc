package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.TextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import controller.IAdapter;
import model.ListAccount;
import model.User;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frame_SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField text_phoneNumber;
	private JPasswordField text_password;
	public static Integer accountRuntime = new Integer(0);
	
	private IAdapter modelAdapter;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Frame_SignIn frame = new Frame_SignIn();
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
	public Frame_SignIn(IAdapter iModelAdapter) {
		
		this.modelAdapter = iModelAdapter;
		setTitle("Đăng nhập");
		setFont(new Font("Arial", Font.PLAIN, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
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

		JLabel label_Password = new JLabel("Mật khẩu :");
		label_Password.setForeground(new Color(0, 0, 255));
		label_Password.setBounds(32, 115, 103, 14);
		contentPane.add(label_Password);

		text_phoneNumber = new JTextField();
		text_phoneNumber.setBounds(175, 62, 231, 20);
		text_phoneNumber.setColumns(10);
		text_phoneNumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {

					e.consume(); // if it's not a number, ignore the event
				}
			}
		});
		contentPane.add(text_phoneNumber);

		text_password = new JPasswordField();
		text_password.setBounds(175, 112, 231, 20);
		contentPane.add(text_password);

		JButton button_forgetPass = new JButton("Quên mật khẩu ");
		button_forgetPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame_ForgotPassword fg = new Frame_ForgotPassword(iModelAdapter);

				fg.show();
				dispose();

			}
		});
		button_forgetPass.setForeground(new Color(0, 0, 255));
		button_forgetPass.setBounds(254, 143, 152, 23);
		contentPane.add(button_forgetPass);

		JCheckBox checkbox_showPass = new JCheckBox("Hiện mật khẩu");
		checkbox_showPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkbox_showPass.isSelected()) {
					text_password.setEchoChar((char) 0);
				} else {
					text_password.setEchoChar('•');
				}
			}
		});
		checkbox_showPass.setBounds(416, 111, 131, 23);
		contentPane.add(checkbox_showPass);

		JButton button_signIn = new JButton("Đăng nhập");
		button_signIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String sdt = text_phoneNumber.getText();
				String pass = text_password.getText();

				if (sdt.length() == 0 || pass.length() == 0) {

					JOptionPane.showMessageDialog(rootPane, "Thông tin của bạn còn thiếu, hãy điền đầy đủ !!!");

				} else {
					
					String text = modelAdapter.signIn(sdt, pass);
					
					switch (text) {
					case "Bạn đã đăng nhập thành công vào hệ thống ^.^": {

						accountRuntime = Integer.parseInt(sdt);
						Frame_Home f_Home = new Frame_Home(iModelAdapter);
						Frame_Home.panel_ThongTinCaNhan.updateData();
						f_Home.show();
						dispose();
						break;
					}
					case "Mật khẩu của bạn không đúng , xin vui lòng đăng nhập lại": {

						JOptionPane.showMessageDialog(rootPane, text);
						text_password.setText("");
						break;
					}
					case "Bạn chưa có tài khoản , xin vui lòng đăng kí !!!": {

						JOptionPane.showMessageDialog(rootPane, text);
						text_phoneNumber.setText("");
						text_password.setText("");
						break;
					}
					
					default:
						throw new IllegalArgumentException("Unexpected value: " + text);
					}
					
				}

			}
		});
		button_signIn.setForeground(new Color(255, 255, 255));
		button_signIn.setBackground(new Color(100, 149, 237));
		button_signIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_signIn.setBounds(175, 212, 372, 54);
		contentPane.add(button_signIn);

		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance()
				.createTitle("Bạn chưa có tài khoản T - kun ?");
		lblNewJgoodiesTitle.setBounds(269, 277, 184, 20);
		contentPane.add(lblNewJgoodiesTitle);

		JButton button_register = new JButton("Đăng kí ngay");
		button_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame_Register r = new Frame_Register(iModelAdapter);
				r.show();

				dispose();
			}
		});
		button_register.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_register.setBackground(new Color(0, 128, 0));
		button_register.setForeground(new Color(255, 255, 255));
		button_register.setBounds(279, 307, 157, 40);
		contentPane.add(button_register);

		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Đăng nhập");
		lblNewJgoodiesLabel.setForeground(new Color(0, 0, 128));
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewJgoodiesLabel.setBounds(307, 11, 146, 40);
		contentPane.add(lblNewJgoodiesLabel);
		
		
	

	}
}
