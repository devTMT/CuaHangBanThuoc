package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import model.Cart;
import model.Product;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Panel_GioHang extends JPanel {

	private JTextField textField_TongTien;
	private JTextField textField_KhuyenMai;
	private JTextField textField_Con;
	private JPanel sub_Panel;

	JTable table = new JTable();
	JScrollPane sc_pane = new JScrollPane(table);

	DefaultTableModel model = new DefaultTableModel() {

		@Override
		public boolean isCellEditable(int row, int column) {
			if (column == 7) {
				return false;
			} else {
				return false;
			}
		};

		public java.lang.Class<?> getColumnClass(int columnIndex) {

			if (columnIndex == 7) {
				return Integer.class;
			} else {

				return String.class;
			}
		};

	};
	protected String id;

	/**
	 * Create the panel.
	 */

	void custom_model() {

		model.addColumn("MSP");
		model.addColumn("Tên Sản Phẩm");
		model.addColumn("Thương hiệu");
		model.addColumn("NSX");
		model.addColumn("Công dụng");
		model.addColumn("Giá bán");
		model.addColumn("Giá khuyến mãi");
		model.addColumn("Số lượng");

		Object[] data = { "", "", "", "", "", "" };
		model.addRow(data);

		table.setModel(model);

	}

	void custom_table_and_add_scrollPane() {

		table.setBackground(Color.white);
		table.setForeground(Color.BLACK);
		table.setSelectionBackground(Color.pink);
		table.setGridColor(Color.red);
		table.setSelectionForeground(Color.DARK_GRAY);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setRowHeight(30);
		table.setAutoCreateColumnsFromModel(true);

		sc_pane.setForeground(Color.RED);
		sc_pane.setBackground(Color.WHITE);
		sc_pane.setBounds(25, 90, 883, 200);
		add(sc_pane);

	}

	void custom_TextField() {

		textField_TongTien = new JTextField();
		textField_TongTien.setBackground(new Color(255, 255, 255));
		textField_TongTien.setEditable(false);
		textField_TongTien.setBounds(110, 20, 204, 20);
		sub_Panel.add(textField_TongTien);
		textField_TongTien.setColumns(10);

		textField_KhuyenMai = new JTextField();
		textField_KhuyenMai.setBackground(new Color(255, 255, 255));
		textField_KhuyenMai.setEditable(false);
		textField_KhuyenMai.setColumns(10);
		textField_KhuyenMai.setBounds(110, 68, 204, 20);
		sub_Panel.add(textField_KhuyenMai);

		textField_Con = new JTextField();
		textField_Con.setBackground(new Color(255, 255, 255));
		textField_Con.setEditable(false);
		textField_Con.setColumns(10);
		textField_Con.setBounds(110, 120, 204, 20);
		sub_Panel.add(textField_Con);

	}

	void custom_subPanel() {
		sub_Panel = new JPanel();
		sub_Panel.setBackground(new Color(250, 240, 230));
		sub_Panel.setBounds(25, 350, 348, 240);
		add(sub_Panel);
		sub_Panel.setLayout(null);
		add(sub_Panel);

		JLabel lblNewLabel = new JLabel("Tổng tiền");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 110, 37);
		sub_Panel.add(lblNewLabel);

		JLabel label_KhuyenMai = new JLabel("Khuyến mãi");
		label_KhuyenMai.setForeground(new Color(0, 0, 0));
		label_KhuyenMai.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_KhuyenMai.setBounds(10, 59, 110, 37);
		sub_Panel.add(label_KhuyenMai);

		JLabel label_Con = new JLabel("Còn");
		label_Con.setForeground(new Color(0, 0, 0));
		label_Con.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_Con.setBounds(10, 111, 110, 37);
		sub_Panel.add(label_Con);

		JLabel label_GioHang = new JLabel("GIỎ HÀNG");
		label_GioHang.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_GioHang.setHorizontalAlignment(SwingConstants.CENTER);
		label_GioHang.setBounds(0, 11, 950, 68);
		add(label_GioHang);

		JButton bt_MuaThem = new JButton("Mua thêm");
		bt_MuaThem.setBackground(new Color(255, 250, 250));
		bt_MuaThem.setBounds(10, 165, 110, 40);
		bt_MuaThem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Frame_Home.menuClicked(Frame_Home.panel_DatThuoc);

			}
		});
		sub_Panel.add(bt_MuaThem);

		JButton bt_DatHang = new JButton("Đặt hàng");
		bt_DatHang.setBackground(new Color(230, 230, 250));
		bt_DatHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(getRootPane(), "Bạn đã đặt hàng thành công ^.^");

			}
		});
		bt_DatHang.setBounds(204, 165, 110, 40);
		sub_Panel.add(bt_DatHang);

	}

	void updateData_into_Panel_GioHang() {

		model.getDataVector().removeAllElements();

		for (Product p : Cart.cart.getProduct_in_cart().keySet()) {

			Object[] data = { p.getIdProduct(), p.getNameProduct(), p.getThuongHieu(), p.getNameNXS(), p.getFunction(),
					p.getPrice(), p.getPromotionalPrice(), Cart.cart.getProduct_in_cart().get(p) };
			model.addRow(data);

		}
		table.setModel(model);

		update_SubPanel();

	}

	void update_SubPanel() {

		Cart.cart.updateValuePrice();

		String tongTien = Cart.cart.getValuePrice_before_Promotional() + "";
		String KhuyenMai = Cart.cart.getValuePrice_Promotional() + "";
		String Con = Cart.cart.getValuePrice_after_Promotional() + "";

		textField_TongTien.setText(tongTien);
		textField_KhuyenMai.setText(KhuyenMai);
		textField_Con.setText(Con);
		

	}

	void update_SoLuong() {

		table.getModel().addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {

				int row = e.getFirstRow();
				int column = e.getColumn();

				if (column == 7) {

					model = (DefaultTableModel) e.getSource();

					Integer value = (Integer) model.getValueAt(row, 7);

					id = (String) model.getValueAt(row, 0);

					Map<Product, Integer> product_in_cart = Cart.cart.getProduct_in_cart();

					for (Product p : product_in_cart.keySet()) {

						if (p.getIdProduct().equals(id)) {

							product_in_cart.put(p, value);
							break;
						}
					}
				}
			}
		});

	}

	public Panel_GioHang() {
		setBackground(new Color(70, 130, 180));
		setBounds(0, 0, 950, 623);
		setLayout(null);
		setVisible(true);

		custom_model();
		custom_table_and_add_scrollPane();
		custom_subPanel();
		custom_TextField();
		updateData_into_Panel_GioHang();
		
		// update_SoLuong();
		

	}
}
