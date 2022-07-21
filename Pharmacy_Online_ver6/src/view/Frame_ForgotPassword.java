package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import controller.IAdapter;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frame_ForgotPassword extends JFrame {

	private JPanel contentPane;
	private JTextField text_phoneNumber;
	private JTextField text_code;
	private JPasswordField text_pass_1;
	private JPasswordField text_pass_2;
	
	private IAdapter modelAdapter;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Frame_ForgotPassword frame = new Frame_ForgotPassword();
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
	public Frame_ForgotPassword(IAdapter iModelAdapter) {
		
		this.modelAdapter = iModelAdapter;
		setTitle("Quên mật khẩu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(275, 100, 742, 522);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Quên mật khẩu");
		lblNewJgoodiesLabel.setBounds(288, 11, 218, 34);
		lblNewJgoodiesLabel.setForeground(new Color(0, 0, 128));
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewJgoodiesLabel);

		JLabel label_phoneNumber = new JLabel("Số điện thoại của bạn:");
		label_phoneNumber.setForeground(new Color(0, 0, 255));
		label_phoneNumber.setBounds(128, 115, 150, 23);
		contentPane.add(label_phoneNumber);

		text_phoneNumber = new JTextField();

		// chỉ nhận số không nhận chữ

		text_phoneNumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {

					e.consume(); // if it's not a number, ignore the event
				}

			}
		});

		text_phoneNumber.setBounds(288, 116, 218, 20);
		contentPane.add(text_phoneNumber);
		text_phoneNumber.setColumns(10);

		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance()
				.createLabel("Vui lòng nhập số điện thoại của bạn, T - kun sẽ gửi cho ");
		lblNewJgoodiesLabel_1.setForeground(new Color(255, 0, 0));
		lblNewJgoodiesLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewJgoodiesLabel_1.setBounds(128, 54, 589, 14);
		contentPane.add(lblNewJgoodiesLabel_1);

		JLabel lblNewJgoodiesLabel_2 = DefaultComponentFactory.getInstance()
				.createLabel("bạn một mật mã để đặt mới mật khẩu của mình");
		lblNewJgoodiesLabel_2.setForeground(new Color(255, 0, 0));
		lblNewJgoodiesLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewJgoodiesLabel_2.setBounds(128, 79, 277, 14);
		contentPane.add(lblNewJgoodiesLabel_2);

		JButton button_TiepTuc_1 = new JButton(" Nhận mã");

		button_TiepTuc_1.setForeground(new Color(255, 255, 255));
		button_TiepTuc_1.setBackground(new Color(60, 179, 113));
		button_TiepTuc_1.setBounds(544, 115, 127, 23);
		contentPane.add(button_TiepTuc_1);

		JLabel label_code = new JLabel("Mã xác nhận:");
		label_code.setForeground(new Color(0, 0, 255));
		label_code.setBounds(128, 170, 113, 14);
		contentPane.add(label_code);

		text_code = new JTextField();
		text_code.setBounds(288, 167, 218, 20);
		contentPane.add(text_code);
		text_code.setColumns(10);

		JToggleButton button_TiepTuc_2 = new JToggleButton("Tiếp tục");
		button_TiepTuc_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (button_TiepTuc_2.isSelected()) {

					text_pass_1.setEditable(true);
					text_pass_2.setEditable(true);
				} else {

					text_pass_1.setText("");
					text_pass_2.setText("");
					text_pass_1.setEditable(false);
					text_pass_2.setEditable(false);
				}
			}
		});
		button_TiepTuc_2.setBackground(new Color(60, 179, 113));
		button_TiepTuc_2.setForeground(new Color(255, 255, 255));
		button_TiepTuc_2.setBounds(544, 166, 127, 23);
		contentPane.add(button_TiepTuc_2);

		JLabel label_pass_1 = new JLabel("Mật khẩu mới:");
		label_pass_1.setForeground(new Color(0, 0, 255));
		label_pass_1.setBounds(128, 215, 99, 14);
		contentPane.add(label_pass_1);

		text_pass_1 = new JPasswordField();
		text_pass_1.setEditable(false);
		text_pass_1.setBounds(288, 212, 218, 20);
		contentPane.add(text_pass_1);

		JLabel label_pass_2 = new JLabel("Xác nhận lại mật khẩu:");
		label_pass_2.setForeground(new Color(0, 0, 255));
		label_pass_2.setBounds(128, 262, 150, 14);
		contentPane.add(label_pass_2);

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
		checkBox_showPass.setBounds(386, 286, 121, 23);
		contentPane.add(checkBox_showPass);

		JButton button_replacePass = new JButton("Đổi mật khẩu");
		button_replacePass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String text_1 = text_phoneNumber.getText();
				String text_2 = text_code.getText();
				String text_3 = text_pass_1.getText();
				String text_4 = text_pass_2.getText();

				if (text_1.length() == 0 || text_2.length() == 0 || text_3.length() == 0 || text_4.length() == 0) {

					JOptionPane.showMessageDialog(rootPane, "Thông tin của bạn còn thiếu, hãy điền đầy đủ !!!");
				}

			}
		});
		button_replacePass.setBackground(Color.PINK);
		button_replacePass.setForeground(Color.WHITE);
		button_replacePass.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_replacePass.setBounds(288, 343, 217, 40);
		contentPane.add(button_replacePass);

		JButton button_Back = new JButton("Trở về");
		button_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Frame_SignIn s = new Frame_SignIn(modelAdapter);
				s.show();

				dispose();
			}
		});
		button_Back.setBackground(new Color(100, 149, 237));
		button_Back.setBounds(0, 445, 113, 40);
		contentPane.add(button_Back);

		text_pass_2 = new JPasswordField();
		text_pass_2.setEditable(false);
		text_pass_2.setBounds(288, 259, 218, 20);
		contentPane.add(text_pass_2);
	}

}
