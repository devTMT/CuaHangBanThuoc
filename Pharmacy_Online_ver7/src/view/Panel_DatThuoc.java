package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import model.Cart;
import model.ListProduct;
import model.Product;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Panel_DatThuoc extends JPanel {

	protected static final int BOOLEAN_COLUMN = 8;

	public Map<Product, Integer> products = new HashMap<>();

	private Image img_Icon_Pills = new ImageIcon("src/image/pills.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);

	private Image img_Icon_Equipment = new ImageIcon("src/image/medical equipment.png").getImage().getScaledInstance(35,
			35, Image.SCALE_SMOOTH);

	private Image img_Icon_DuocPham = new ImageIcon("src/image/duoc_pham.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);
	private Image img_Icon_ChamSocSucKhoe = new ImageIcon("src/image/cham_soc_suc_khoe.png").getImage()
			.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_Icon_ChamSocCaNhan = new ImageIcon("src/image/cham_soc_ca_nhan.jpg").getImage()
			.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_Icon_SanPhamTienLoi = new ImageIcon("src/image/san_pham_tien_loi.png").getImage()
			.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_Icon_ThucPhamChucNang = new ImageIcon("src/image/thuc_pham_chuc_nang.png").getImage()
			.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_Icon_MeVaBe = new ImageIcon("src/image/me_va_be.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);
	private Image img_Icon_ChamSocSacDep = new ImageIcon("src/image/cham_soc_sac_dep.jpg").getImage()
			.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_Icon_ThuocKhongKeDon = new ImageIcon("src/image/img_thuockhongkedon.png").getImage()
			.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_Icon_TatCa = new ImageIcon("src/image/tatca.jpg").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);

	private JMenuBar menubar = new JMenuBar();
	private JMenu menu_DanhMuc = new JMenu("Danh mục");
	private JMenu menu_DuocPham = new JMenu("Dược phẩm");
	private JMenu menu_ChamSocSucKhoe = new JMenu("Chăm sóc sức khỏe");
	private JMenu menu_ChamSocCaNhan = new JMenu("Chăm sóc cá nhân");
	private JMenu menu_SanPhamTienLoi = new JMenu("Sản phẩm tiện lợi");
	private JMenu menu_ThucPhamChucNang = new JMenu("Thực phẩm chức năng");
	private JMenu menu_MeVaBe = new JMenu("Mẹ và bé");
	private JMenu menu_ChamSocSacDep = new JMenu("Chăm sóc sắc đẹp");
	private JMenu menu_ThietBiYTe = new JMenu("Thiết bị y tế");
	private JTextField tf_status = new JTextField("Xin chào quý khách ^.^");
	private String text_NameTypeProduct = "";// tên của loại sản phẩm khi click vào một menuItem nào đấy

	String[] arr_Sort = { "--------", "Giá giảm dần", "Giá tăng dần", "Mới nhất" };
	JComboBox comboBox_sort = new JComboBox(arr_Sort);

	private JMenuItem it_ThuocKeDon = new JMenuItem("Thuốc kê đơn");
	private JMenuItem it_ThuocKhongKeDon = new JMenuItem("Thuốc không kê đơn");

	private JMenuItem it_TatCa = new JMenuItem("Tất cả");

	private JMenuItem it_cssk_1 = new JMenuItem("Thực phẩm dinh dưỡng");
	private JMenuItem it_cssk_2 = new JMenuItem("Dụng cụ sơ cứu");
	private JMenuItem it_cssk_3 = new JMenuItem("Kế hoạch gia đình");
	private JMenuItem it_cssk_4 = new JMenuItem("Chăm sóc Mắt/Tai/Mũi");
	private JMenuItem it_cssk_5 = new JMenuItem("Chăm sóc chân");
	private JMenuItem it_cssk_6 = new JMenuItem("Khẩu trang y tế");
	private JMenuItem it_cssk_7 = new JMenuItem("Chống muỗi");
	private JMenuItem it_cssk_8 = new JMenuItem("Dầu tràm/dầu xoa bóp");

	private JMenuItem it_cscn_1 = new JMenuItem("Sản phẩm phòng tắm");
	private JMenuItem it_cscn_2 = new JMenuItem("Sản phẩm khử mùi");
	private JMenuItem it_cscn_3 = new JMenuItem("Chăm sóc tóc");
	private JMenuItem it_cscn_4 = new JMenuItem("Vệ sinh phụ nữ");
	private JMenuItem it_cscn_5 = new JMenuItem("Chăm sóc nam giới");
	private JMenuItem it_cscn_6 = new JMenuItem("Chăm sóc răng miệng");
	private JMenuItem it_cscn_7 = new JMenuItem("Chăm sóc cơ thể");

	private JMenuItem it_sptl_1 = new JMenuItem("Hàng tổng hợp");
	private JMenuItem it_sptl_2 = new JMenuItem("Hàng bách hóa");

	private JMenuItem it_tpcn_1 = new JMenuItem("TPCN Nhóm dạ dày");
	private JMenuItem it_tpcn_2 = new JMenuItem("TPCN Nhóm tim mạch");
	private JMenuItem it_tpcn_3 = new JMenuItem("TPCN Nhóm đường huyết");

	private JMenuItem it_mvb_1 = new JMenuItem("Chăm sóc em bé");
	private JMenuItem it_mvb_2 = new JMenuItem("TPCN dành cho trẻ em");
	private JMenuItem it_mvb_3 = new JMenuItem("Sản phẩm dành cho mẹ");
	private JMenuItem it_mvb_4 = new JMenuItem("TPCN dành cho phụ nữ mang thai");

	private JMenuItem it_cssd_1 = new JMenuItem("Chăm sóc mặt");
	private JMenuItem it_cssd_2 = new JMenuItem("Sản phẩm chống nắng");
	private JMenuItem it_cssd_3 = new JMenuItem("Dụng cụ làm đẹp");
	private JMenuItem it_cssd_4 = new JMenuItem("Dược - Mỹ phẩm");

	private JMenuItem it_tbyt_1 = new JMenuItem("Nhiệt kế");
	private JMenuItem it_tbyt_2 = new JMenuItem("Máy đo huyết áp");
	private JMenuItem it_tbyt_3 = new JMenuItem("Máy đo đường huyết");
	private JMenuItem it_tbyt_4 = new JMenuItem("Máy xông khí dung");
	private JMenuItem it_tbyt_5 = new JMenuItem("Thiết bị y tế khác");
	private JMenuItem it_tbyt_6 = new JMenuItem("Dụng cụ kiểm tra");

	private static ItemListener it_listener;

	JTable table = new JTable();
	JScrollPane sc_pane = new JScrollPane(table);

	DefaultTableModel model = new DefaultTableModel() {

		@Override
		public boolean isCellEditable(int row, int column) {

			if (column == BOOLEAN_COLUMN) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public Class<?> getColumnClass(int column) {

			return column == BOOLEAN_COLUMN ? Boolean.class : String.class;
		}
	};

	protected String name;

	protected String id;

	protected String ThuongHieu;

	protected String NSX;

	protected String function;

	protected Double price;

	protected Double promationalPrice;

	void custom_model_table() {

		model.addColumn("STT");
		model.addColumn("MSP");
		model.addColumn("Tên Sản Phẩm");
		model.addColumn("Thương hiệu");
		model.addColumn("Nơi sản xuất");
		model.addColumn("Công dụng");
		model.addColumn("Giá bán");
		model.addColumn("Giá khuyến mãi");
		model.addColumn("Chọn mua");

	}

	void custom_table_and_add_into_jscrollPane() {

		table.setBackground(Color.white);
		table.setForeground(Color.BLACK);
		table.setGridColor(Color.red);
		table.setSelectionForeground(Color.DARK_GRAY);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setRowHeight(30);
		table.setAutoCreateColumnsFromModel(true);

		sc_pane.setForeground(Color.RED);
		sc_pane.setBackground(Color.WHITE);
		sc_pane.setBounds(10, 106, 900, 470);
		add(sc_pane);
		
		JButton btnClearSelect = new JButton("Clear select");
		btnClearSelect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clearSelect();
			}
		});
		btnClearSelect.setBounds(800, 586, 110, 21);
		add(btnClearSelect);

	}

	public void clearSelect() {
		for (int i = 0; i < model.getRowCount(); i++) {
			model.setValueAt(false, i, model.getColumnCount()-1);
		}
	}

	void custom_tf_Status() {

		tf_status.setBackground(new Color(255, 99, 71));
		tf_status.setHorizontalAlignment(SwingConstants.CENTER);
		tf_status.setFont(new Font("Tahoma", Font.BOLD, 15));
		tf_status.setEditable(false);
		tf_status.setBounds(72, 0, 878, 60);
		add(tf_status);
	}

	/**
	 * Create the panel.
	 */

	void addItemForMenu() {

		menu_DuocPham.add(it_ThuocKeDon);
		menu_DuocPham.add(it_ThuocKhongKeDon);

		menu_ChamSocSucKhoe.add(it_cssk_1);
		menu_ChamSocSucKhoe.add(it_cssk_2);
		menu_ChamSocSucKhoe.add(it_cssk_3);
		menu_ChamSocSucKhoe.add(it_cssk_4);
		menu_ChamSocSucKhoe.add(it_cssk_5);
		menu_ChamSocSucKhoe.add(it_cssk_6);
		menu_ChamSocSucKhoe.add(it_cssk_7);
		menu_ChamSocSucKhoe.add(it_cssk_8);

		menu_ChamSocCaNhan.add(it_cscn_1);
		menu_ChamSocCaNhan.add(it_cscn_2);
		menu_ChamSocCaNhan.add(it_cscn_3);
		menu_ChamSocCaNhan.add(it_cscn_4);
		menu_ChamSocCaNhan.add(it_cscn_5);
		menu_ChamSocCaNhan.add(it_cscn_6);
		menu_ChamSocCaNhan.add(it_cscn_7);

		menu_SanPhamTienLoi.add(it_sptl_1);
		menu_SanPhamTienLoi.add(it_sptl_2);

		menu_ThucPhamChucNang.add(it_tpcn_1);
		menu_ThucPhamChucNang.add(it_tpcn_2);
		menu_ThucPhamChucNang.add(it_tpcn_3);

		menu_MeVaBe.add(it_mvb_1);
		menu_MeVaBe.add(it_mvb_2);
		menu_MeVaBe.add(it_mvb_3);
		menu_MeVaBe.add(it_mvb_4);

		menu_ChamSocSacDep.add(it_cssd_1);
		menu_ChamSocSacDep.add(it_cssd_2);
		menu_ChamSocSacDep.add(it_cssd_3);
		menu_ChamSocSacDep.add(it_cssd_4);

		menu_ThietBiYTe.add(it_tbyt_1);
		menu_ThietBiYTe.add(it_tbyt_2);
		menu_ThietBiYTe.add(it_tbyt_3);
		menu_ThietBiYTe.add(it_tbyt_4);
		menu_ThietBiYTe.add(it_tbyt_5);
		menu_ThietBiYTe.add(it_tbyt_6);
	}

	void addIconForMenu() {

		menu_ThietBiYTe.setIcon(new ImageIcon(img_Icon_Equipment));
		menu_DuocPham.setIcon(new ImageIcon(img_Icon_DuocPham));
		menu_ChamSocSucKhoe.setIcon(new ImageIcon(img_Icon_ChamSocSucKhoe));
		menu_ChamSocCaNhan.setIcon(new ImageIcon(img_Icon_ChamSocCaNhan));
		menu_ChamSocSacDep.setIcon(new ImageIcon(img_Icon_ChamSocSacDep));
		menu_SanPhamTienLoi.setIcon(new ImageIcon(img_Icon_SanPhamTienLoi));
		menu_MeVaBe.setIcon(new ImageIcon(img_Icon_MeVaBe));
		menu_ThucPhamChucNang.setIcon(new ImageIcon(img_Icon_ThucPhamChucNang));

		it_ThuocKeDon.setIcon(new ImageIcon(img_Icon_Pills));
		it_ThuocKhongKeDon.setIcon(new ImageIcon(img_Icon_ThuocKhongKeDon));
		it_TatCa.setIcon(new ImageIcon(img_Icon_TatCa));
	}

	void addMenuBar() {

		addIconForMenu();
		addItemForMenu();

		menubar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menubar.setBackground(new Color(255, 192, 203));

		menubar.add(menu_DanhMuc);

		menu_DanhMuc.add(it_TatCa);
		menu_DanhMuc.add(menu_DuocPham);
		menu_DanhMuc.add(menu_ChamSocSucKhoe);
		menu_DanhMuc.add(menu_ChamSocCaNhan);
		menu_DanhMuc.add(menu_SanPhamTienLoi);
		menu_DanhMuc.add(menu_ThucPhamChucNang);
		menu_DanhMuc.add(menu_MeVaBe);
		menu_DanhMuc.add(menu_ChamSocSacDep);
		menu_DanhMuc.add(menu_ThietBiYTe);

	}

	void action_when_click_in_MenuItem() {
		it_TatCa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText("Xin chào quý khách ^.^");
				text_NameTypeProduct = it_TatCa.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort(); // remove đi sự kiện cũ , add vào sự kiện mới

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		// Menu Dược phẩm
		it_ThuocKeDon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_ThuocKeDon.getText());
				text_NameTypeProduct = it_ThuocKeDon.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_ThuocKhongKeDon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_ThuocKhongKeDon.getText());
				text_NameTypeProduct = it_ThuocKhongKeDon.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		// Menu Chăm sóc sức khỏe
		it_cssk_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cssk_1.getText());
				text_NameTypeProduct = it_cssk_1.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cssk_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cssk_2.getText());
				text_NameTypeProduct = it_cssk_2.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cssk_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cssk_3.getText());
				text_NameTypeProduct = it_cssk_3.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cssk_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cssk_3.getText());
				text_NameTypeProduct = it_cssk_3.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cssk_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cssk_4.getText());
				text_NameTypeProduct = it_cssk_4.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cssk_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cssk_5.getText());
				text_NameTypeProduct = it_cssk_5.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cssk_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cssk_6.getText());
				text_NameTypeProduct = it_cssk_6.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cssk_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cssk_7.getText());
				text_NameTypeProduct = it_cssk_7.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cssk_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cssk_8.getText());
				text_NameTypeProduct = it_cssk_8.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});

		// Menu Chăm sóc cá nhân
		it_cscn_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cscn_1.getText());
				text_NameTypeProduct = it_cscn_1.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});

		it_cscn_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cscn_2.getText());
				text_NameTypeProduct = it_cscn_2.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});

		it_cscn_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cscn_3.getText());
				text_NameTypeProduct = it_cscn_3.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cscn_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				tf_status.setText(it_cscn_4.getText());
				text_NameTypeProduct = it_cscn_4.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cscn_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cscn_5.getText());
				text_NameTypeProduct = it_cscn_5.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cscn_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cscn_6.getText());
				text_NameTypeProduct = it_cscn_6.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
		it_cscn_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_cscn_7.getText());
				text_NameTypeProduct = it_cscn_7.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});

		// Menu sản phẩm tiện lợi
		it_sptl_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_sptl_1.getText());
				text_NameTypeProduct = it_sptl_1.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});

		it_sptl_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf_status.setText(it_sptl_2.getText());
				text_NameTypeProduct = it_sptl_2.getText();
				comboBox_sort.setSelectedIndex(0);

				reset_ComboBox_Sort();

				String txt = text_NameTypeProduct;
				when_click_comboBox_Sort(txt);
				display_when_click_in_MenuItem(text_NameTypeProduct);
			}
		});
	}

	void display_when_click_in_MenuItem(String nameTypeProduct) {

		model.getDataVector().removeAllElements();
		int i = 1;
		// lấy ra value của key
		Set<Product> set = ListProduct.l_Product.search_Products_byNameType(nameTypeProduct);

		if (set == null) {
			Object[] data_null = { "null", "null", "null", "null", "null", "null", "null", "null" };
			model.addRow(data_null);
		} else {
			for (Product p : set) {
				Object[] data = { i, p.getIdProduct(), p.getNameProduct(), p.getThuongHieu(), p.getNameNXS(),
						p.getFunction(), p.getPrice(), p.getPromotionalPrice() };

				model.addRow(data);
				i++;
			}
		}

		table.setModel(model);
		table.getColumnModel().getColumn(5).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
	}

	void when_click_comboBox_Sort(String nameTypeProduct) {

		it_listener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				model.getDataVector().removeAllElements();
				String text = (String) comboBox_sort.getSelectedItem();
				switch (text) {
				case "Giá giảm dần":

					Set<Product> set_desc = ListProduct.l_Product.sort_Descending_PromotionalPrice(nameTypeProduct);
					int i = 1;
					for (Product p : set_desc) {

						Object[] data = { i, p.getIdProduct(), p.getNameProduct(), p.getThuongHieu(), p.getNameNXS(),
								p.getFunction(), p.getPrice(), p.getPromotionalPrice() };

						model.addRow(data);
						i++;
					}
					break;
				case "Giá tăng dần":

					Set<Product> set_asc = ListProduct.l_Product.sort_Ascending_PromationalPrice(nameTypeProduct);
					int j = 1;
					for (Product p : set_asc) {

						Object[] data = { j, p.getIdProduct(), p.getNameProduct(), p.getThuongHieu(), p.getNameNXS(),
								p.getFunction(), p.getPrice(), p.getPromotionalPrice() };

						model.addRow(data);
						j++;

					}

					break;

				default:

					display_when_click_in_MenuItem(nameTypeProduct);
					break;
				}

				table.setModel(model);
				table.getColumnModel().getColumn(5).setPreferredWidth(150);
				table.getColumnModel().getColumn(2).setPreferredWidth(200);

			}

		};
		comboBox_sort.addItemListener(it_listener);
	}

	void reset_ComboBox_Sort() {

		comboBox_sort.removeItemListener(it_listener);

	}

	void get_Data_From_Table() {

		table.getModel().addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {
				int row = e.getFirstRow();
				int column = e.getColumn();

				if (column == BOOLEAN_COLUMN) {

					model = (DefaultTableModel) e.getSource();
					String columnName = model.getColumnName(column);
					Boolean checked = (Boolean) model.getValueAt(row, column);

					if (checked) {

						id = (String) model.getValueAt(row, 1);
						name = (String) model.getValueAt(row, 2);
						ThuongHieu = (String) model.getValueAt(row, 3);
						NSX = (String) model.getValueAt(row, 4);
						function = (String) model.getValueAt(row, 5);
						price = (Double) model.getValueAt(row, 6);
						promationalPrice = (Double) model.getValueAt(row, 7);

						Product p = new Product(id, name, price, promationalPrice, NSX, ThuongHieu, function);
						products.put(p, 1);

						Cart.cart.setProduct_in_cart(products);

						Frame_Home.panel_GioHang.updateData_into_Panel_GioHang();
					} else {
						id = (String) model.getValueAt(row, 1);
						name = (String) model.getValueAt(row, 2);
						ThuongHieu = (String) model.getValueAt(row, 3);
						NSX = (String) model.getValueAt(row, 4);
						function = (String) model.getValueAt(row, 5);
						price = (Double) model.getValueAt(row, 6);
						promationalPrice = (Double) model.getValueAt(row, 7);

						Product p = new Product(id, name, price, promationalPrice, NSX, ThuongHieu, function);
						products.remove(p);

						Cart.cart.setProduct_in_cart(products);

						Frame_Home.panel_GioHang.updateData_into_Panel_GioHang();
					}
				}
			}
		});
	}

	public Panel_DatThuoc() {
		setBackground(new Color(70, 130, 180));
		setBounds(0, 0, 950, 623);
		setLayout(null);
		setVisible(true);

		menubar.setBounds(0, 0, 72, 60);
		add(menubar);

		comboBox_sort.setBounds(730, 73, 135, 22);
		add(comboBox_sort);

		JLabel label_Sort = new JLabel("Sắp xếp theo");
		label_Sort.setForeground(Color.WHITE);
		label_Sort.setBounds(626, 71, 81, 24);
		add(label_Sort);

		custom_model_table();
		addMenuBar();
		custom_tf_Status();
		custom_table_and_add_into_jscrollPane();
		display_when_click_in_MenuItem("Tất cả");
		when_click_comboBox_Sort("Tất cả");
		action_when_click_in_MenuItem();

		get_Data_From_Table();
	}
}
