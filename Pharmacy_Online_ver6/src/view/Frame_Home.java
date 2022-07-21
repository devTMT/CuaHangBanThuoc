package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.IAdapter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Frame_Home extends JFrame {

	private IAdapter modelAdapter;
	private JPanel contentPane;
	private Image imgIcon_1 = new ImageIcon("src/image/pharmacy.png").getImage().getScaledInstance(150, 150,
			Image.SCALE_SMOOTH);

	private Image img_Icon_0 = new ImageIcon("src/image/drugstore.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);
	private Image img_Icon_1 = new ImageIcon("src/image/medicines.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);
	private Image img_Icon_2 = new ImageIcon("src/image/cart.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);
	private Image img_Icon_3 = new ImageIcon("src/image/historyCart.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);
	private Image img_Icon_4 = new ImageIcon("src/image/user.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);
	private Image img_Icon_5 = new ImageIcon("src/image/momo.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);
	private Image img_Icon_6 = new ImageIcon("src/image/logout.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);

	public static Panel_TimNhaThuoc panel_TimNhaThuoc = new Panel_TimNhaThuoc();
	public static Panel_DatThuoc panel_DatThuoc = new Panel_DatThuoc();
	public static Panel_GioHang panel_GioHang = new Panel_GioHang();
	public static Panel_LichSuDatHang panel_LichSuDonHang = new Panel_LichSuDatHang();
	public static Panel_ThongTinKhachHang panel_ThongTinCaNhan = new Panel_ThongTinKhachHang();
	public static Panel_SuaThongTinCaNhan panel_SuaThongTinCaNhan = new Panel_SuaThongTinCaNhan();
	

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Frame_Home frame = new Frame_Home();
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
	public Frame_Home(IAdapter iModelAdapter) {
		
		this.modelAdapter = iModelAdapter;
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 15, 1300, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//		panel_TimNhaThuoc = new Panel_TimNhaThuoc();
//		panel_DatThuoc = new Panel_DatThuoc();
//		panel_GioHang = new Panel_GioHang();
//		panel_LichSuDonHang = new Panel_LichSuDatHang();
//		panel_ThongTinCaNhan = new Panel_ThongTinKhachHang();
//		panel_ViThanhToan = new Panel_ViThanhToan();

		JPanel panel_Menu = new JPanel();
		panel_Menu.setBackground(new Color(0, 128, 128));
		panel_Menu.setBounds(0, 0, 313, 623);
		contentPane.add(panel_Menu);
		panel_Menu.setLayout(null);

		JLabel label_Icon = new JLabel("");
		label_Icon.setHorizontalAlignment(SwingConstants.CENTER);
		label_Icon.setBounds(61, 11, 209, 158);
		label_Icon.setIcon(new ImageIcon(imgIcon_1));
		panel_Menu.add(label_Icon);

		JPanel panel_0 = new JPanel();
		panel_0.setForeground(new Color(255, 255, 255));
		panel_0.setBackground(new Color(0, 139, 139));
		panel_0.setBounds(0, 180, 313, 50);
		panel_0.addMouseListener(new PanelButtonMouseAdapter(panel_0) {

			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_TimNhaThuoc);
			}
		});
		panel_Menu.add(panel_0);
		panel_0.setLayout(null);

		JLabel lblNewLabel_0 = new JLabel("Tìm nhà thuốc");
		lblNewLabel_0.setForeground(Color.WHITE);
		lblNewLabel_0.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_0.setBounds(90, 0, 191, 39);
		panel_0.add(lblNewLabel_0);

		JLabel label_Icon_0 = new JLabel("");
		label_Icon_0.setBounds(10, 0, 70, 40);
		label_Icon_0.setIcon(new ImageIcon(img_Icon_0));
		panel_0.add(label_Icon_0);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(0, 139, 139));
		panel_1.setBounds(0, 230, 313, 50);
		panel_1.addMouseListener(new PanelButtonMouseAdapter(panel_1) {

			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_DatThuoc);
			}
		});
		panel_Menu.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Đặt thuốc / thiết bị y tế");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1.setBounds(90, 0, 191, 39);
		panel_1.add(lblNewLabel_1);

		JLabel label_Icon_1 = new JLabel("");
		label_Icon_1.setBounds(10, 0, 70, 40);
		label_Icon_1.setIcon(new ImageIcon(img_Icon_1));
		panel_1.add(label_Icon_1);

		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(255, 255, 255));
		panel_2.setBackground(new Color(0, 139, 139));
		panel_2.setBounds(0, 280, 313, 50);
		panel_2.addMouseListener(new PanelButtonMouseAdapter(panel_2) {

			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_GioHang);
			}
		});
		panel_Menu.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Giỏ hàng");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setBounds(90, 0, 191, 39);
		panel_2.add(lblNewLabel_2);

		JLabel label_Icon_2 = new JLabel("");
		label_Icon_2.setBounds(10, 0, 70, 40);
		label_Icon_2.setIcon(new ImageIcon(img_Icon_2));
		panel_2.add(label_Icon_2);

		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(255, 255, 255));
		panel_3.setBackground(new Color(0, 139, 139));
		panel_3.setBounds(0, 330, 313, 50);
		panel_3.addMouseListener(new PanelButtonMouseAdapter(panel_3) {

			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_LichSuDonHang);
			}
		});
		panel_Menu.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Lịch sử đặt hàng");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setBounds(90, 0, 191, 39);
		panel_3.add(lblNewLabel_3);

		JLabel label_Icon_3 = new JLabel("");
		label_Icon_3.setBounds(10, 0, 70, 40);
		label_Icon_3.setIcon(new ImageIcon(img_Icon_3));
		panel_3.add(label_Icon_3);

		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(255, 255, 255));
		panel_6.setBackground(new Color(0, 139, 139));
		panel_6.setBounds(0, 480, 313, 50);
		panel_6.addMouseListener(new PanelButtonMouseAdapter(panel_6) {

			@Override
			public void mouseClicked(MouseEvent e) {

				if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất?") == 0) {

					Frame_SignIn frame = new Frame_SignIn(modelAdapter);
					frame.show();
					dispose();

				}
			}
		});
		panel_Menu.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("ĐĂNG XUẤT");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_6.setBounds(90, 0, 191, 39);
		panel_6.add(lblNewLabel_6);

		JLabel label_Icon_6 = new JLabel("");
		label_Icon_6.setBounds(10, 0, 70, 40);
		label_Icon_6.setIcon(new ImageIcon(img_Icon_6));
		panel_6.add(label_Icon_6);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 139, 139));
		panel_4.setForeground(new Color(255, 255, 255));
		panel_4.setBounds(0, 380, 313, 50);
		panel_4.addMouseListener(new PanelButtonMouseAdapter(panel_4) {

			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_ThongTinCaNhan);
			}
		});
		panel_Menu.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Thông tin khách hàng");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4.setBounds(90, 0, 191, 39);
		panel_4.add(lblNewLabel_4);

		JLabel label_Icon_4 = new JLabel("");
		label_Icon_4.setBounds(10, 0, 70, 40);
		label_Icon_4.setIcon(new ImageIcon(img_Icon_4));
		panel_4.add(label_Icon_4);

		JPanel panel_MainContent = new JPanel();
		panel_MainContent.setBounds(313, 0, 970, 623);
		contentPane.add(panel_MainContent);
		panel_MainContent.setLayout(null);

		// add cái panel nào trước thì nó sẽ hiển thị ra trước ( dùng cấu trúc Hàng đợi
		// (Queue) )
		panel_MainContent.add(panel_TimNhaThuoc).setVisible(true);
		panel_MainContent.add(panel_DatThuoc).setVisible(false);
		panel_MainContent.add(panel_GioHang).setVisible(false);
		panel_MainContent.add(panel_LichSuDonHang).setVisible(false);
		panel_MainContent.add(panel_ThongTinCaNhan).setVisible(false);
		panel_MainContent.add(panel_SuaThongTinCaNhan).setVisible(false);
		
	
		

	}

	// khi click vào menu nào thì sẽ hiện ra cái panel mà menu đó tham chiếu tới
	public static void menuClicked(JPanel panel) {

		panel_TimNhaThuoc.setVisible(false);
		panel_DatThuoc.setVisible(false);
		panel_GioHang.setVisible(false);
		panel_LichSuDonHang.setVisible(false);
		panel_ThongTinCaNhan.setVisible(false);
		panel_SuaThongTinCaNhan.setVisible(false);

		panel.setVisible(true);

	}

	private class PanelButtonMouseAdapter extends MouseAdapter {

		JPanel panel;

		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}

		@Override
		// khi nhấn chuột vào panel
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144)); // màu xanh lá

		}

		@Override
		// khi thả chuột ra thì màu của panel sẽ là
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(0, 139, 139));

		}

		@Override
		// khi rê chuột đến panel
		public void mousePressed(MouseEvent e) {

			panel.setBackground(new Color(60, 179, 113)); // màu xám

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144)); // màu xanh lá
		}

	}
}
