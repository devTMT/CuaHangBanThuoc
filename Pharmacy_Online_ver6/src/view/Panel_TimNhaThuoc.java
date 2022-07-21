package view;

import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.layout.FormSpec.DefaultAlignment;

import model.ListPharmacy;
import model.ListProduct;
import model.Pharmacy;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Set;
import java.awt.event.ActionEvent;

public class Panel_TimNhaThuoc extends JPanel {

	private Image img_Icon_Search = new ImageIcon("src/image/search.png").getImage().getScaledInstance(35, 35,
			Image.SCALE_SMOOTH);

	private String[] cities = { "----", "TP.Hồ Chí Minh", "Hà Nội", "Nam Định" };
	private String[] district_Default_1 = { "----" };
	private String[] district_Default_2 = { "Quận 1", "Quận 2", "Quận 3", "Quận 4", "Quận 5", "Quận 6", "Quận 7",
			"Quận 8", "Quận 9", "Quận 10", "Quận 11", "Quận 12", "Quận Thủ Đức ", "Quận Bình Tân", "Quận Phú Nhuận",
			"Quận Bình Thạnh", "Quận Tân Phú", "Quận Tân Bình", "Quận Gò Vấp", "Huyện Nhà Bè", "Huyện Bình Chánh",
			"Huyện Cần Giờ", "Huyện Hóc Môn", "Huyện Củ Chi" };

	JComboBox comboBox_Cities = new JComboBox(cities);
	JComboBox comboBox_District = new JComboBox(district_Default_1);

	JButton button_Search = new JButton("Tìm kiếm");
	JTable table = new JTable();
	JScrollPane sc_pane = new JScrollPane(table);

	DefaultTableModel model = new DefaultTableModel() {

		@Override
		public boolean isCellEditable(int row, int column) {
			// TODO Auto-generated method stub
			return false;
		}
	};

	private String text_City;
	private String text_District;
	private String text;

	/**
	 * Create the panel.
	 */

	public void custom_model_table() {
		model.addColumn("STT");
		model.addColumn("Mã Nhà Thuốc");
		model.addColumn("Tên Nhà Thuóc");
		model.addColumn("Địa chỉ");
		model.addColumn("Số điện thoại");
		
	}

	public void custom_table_and_add_into_jscrollPane() {

		table.setBackground(Color.white);
		table.setForeground(Color.BLACK);
		table.setSelectionBackground(Color.pink);
		table.setGridColor(Color.red);
		table.setSelectionForeground(Color.DARK_GRAY);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setRowHeight(40);
		table.setAutoCreateColumnsFromModel(true);

		sc_pane.setForeground(Color.RED);
		sc_pane.setBackground(Color.WHITE);
		sc_pane.setBounds(23, 173, 900, 300);
		add(sc_pane);

	}

	public void when_click_in_ComboBox_Cities() {
		ItemListener itemListener = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub

				String item = (String) comboBox_Cities.getSelectedItem();

				switch (item) {
				case "----": {

					comboBox_District.removeAllItems();
					comboBox_District.addItem("----");
					break;

				}
				case "TP.Hồ Chí Minh": {
					comboBox_District.removeAllItems();
					comboBox_District.addItem("Quận 1");
					comboBox_District.addItem("Quận 2");
					comboBox_District.addItem("Quận 3");
					comboBox_District.addItem("Quận 4");
					comboBox_District.addItem("Quận 5");
					comboBox_District.addItem("Quận 6");
					comboBox_District.addItem("Quận 7");
					comboBox_District.addItem("Quận 8");
					comboBox_District.addItem("Quận 9");
					comboBox_District.addItem("Quận 10");
					comboBox_District.addItem("Quận 11");
					comboBox_District.addItem("Quận 12");
					comboBox_District.addItem("Quận Thủ Đức");
					comboBox_District.addItem("Quận Bình Tân");
					comboBox_District.addItem("Quận Phú Nhuận");
					comboBox_District.addItem("Quận Bình Thạnh");
					comboBox_District.addItem("Quận Tân Phú");
					comboBox_District.addItem("Quận Tân Bình");
					comboBox_District.addItem("Quận Gò Vấp");
					comboBox_District.addItem("Huyện Nhà Bè");
					comboBox_District.addItem("Huyện Bình Chánh");
					comboBox_District.addItem("Huyện Cần Giờ");
					comboBox_District.addItem("Huyện Hóc Môn");
					comboBox_District.addItem("Huyện Củ Chi");
					break;

				}
				case "Hà Nội": {

					comboBox_District.removeAllItems();
					comboBox_District.addItem("Thị xã Sơn Tây");
					comboBox_District.addItem("Quận Hoàn Kiếm");
					comboBox_District.addItem("Quận Đống Đa");
					comboBox_District.addItem("Quận Ba Đình");
					comboBox_District.addItem("Quận Hai Bà Trưng");
					comboBox_District.addItem("Quận Hoàng Mai");
					comboBox_District.addItem("Quận Thanh Xuân");
					comboBox_District.addItem("Quận Long Biên");
					comboBox_District.addItem("Quận Nam Từ Liên");
					comboBox_District.addItem("Quận Bắc Từ Liêm");
					comboBox_District.addItem("Quận Tây Hồ");
					comboBox_District.addItem("Quận Cầu Giấy");
					comboBox_District.addItem("Quận Hà Đông");
					comboBox_District.addItem("Huyện Ba Vì");
					comboBox_District.addItem("Huyện Chương Mĩ");
					comboBox_District.addItem("Huyện Phúc Thọ");
					comboBox_District.addItem("Huyện Đan Phượng");
					comboBox_District.addItem("Huyện Đông Anh");
					comboBox_District.addItem("Huyện Gia Lâm");
					comboBox_District.addItem("Huyện Hoài Đức");
					comboBox_District.addItem("Huyện Mê Linh");
					comboBox_District.addItem("Huyện Mỹ Đức");
					comboBox_District.addItem("Huyện Phú Xuyên");
					comboBox_District.addItem("Huyện Quốc Oai");
					comboBox_District.addItem("Huyện Sóc Sơn");
					comboBox_District.addItem("Huyện Thạch Thất");
					comboBox_District.addItem("Huyện Thanh Oai");
					comboBox_District.addItem("Huyện Thường Tín");
					comboBox_District.addItem("Huyện Ứng Hòa");
					comboBox_District.addItem("Huyện Thanh Trì");
					break;

				}
				case "Nam Định": {

					comboBox_District.removeAllItems();
					comboBox_District.addItem("TP.Nam Định");
					comboBox_District.addItem("Huyện Mỹ Lộc");
					comboBox_District.addItem("Huyện Vụ Bản");
					comboBox_District.addItem("Huyện Ý Yên");
					comboBox_District.addItem("Huyện Nghĩa Hưng");
					comboBox_District.addItem("Huyện Nam Trực");
					comboBox_District.addItem("Huyện Trực Ninh");
					comboBox_District.addItem("Huyện Xuân Trường");
					comboBox_District.addItem("Huyện Giao Thủy");
					comboBox_District.addItem("Huyện Hải Hậu");
					break;

				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + item);
				}

			}
		};
		comboBox_Cities.addItemListener(itemListener);

	}

	public void action_before_when_click_button_Search() {

		int i = 1;

		// chạy từng key
		for (String s : ListPharmacy.l_P.getList_Pharmacies().keySet()) {

			// lấy ra value của mỗi key
			Set<Pharmacy> set = ListPharmacy.l_P.search_ListPharmacies_ByName(s);

			for (Pharmacy p : set) {

				Object[] data = { i, p.getIdPharmacy(), p.getNamePharmacy(), p.getAddress(), p.getPhoneNumber() };
				model.addRow(data);
				i++;

			}

		}

		table.setModel(model);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(500);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);

	}

	public void action_when_click_button_Search() {

		button_Search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				model.getDataVector().removeAllElements();
				text_City = (String) comboBox_Cities.getSelectedItem();
				text_District = (String) comboBox_District.getSelectedItem();
				text = text_District + "," + text_City;

				if (text.equals("----,----")) {

					action_before_when_click_button_Search();

				} else {

					int i = 1;
					Set<Pharmacy> set = ListPharmacy.l_P.search_ListPharmacies_ByName(text);

					if (set == null) {

						Object[] data_null = { "null", "null", "null", "null", "null" };
						model.addRow(data_null);
						table.setModel(model);
						table.getColumnModel().getColumn(1).setPreferredWidth(100);
						table.getColumnModel().getColumn(2).setPreferredWidth(200);
						table.getColumnModel().getColumn(3).setPreferredWidth(500);
						table.getColumnModel().getColumn(4).setPreferredWidth(100);
						

					} else {
						for (Pharmacy p : set) {

							Object[] data = { i, p.getIdPharmacy(), p.getNamePharmacy(), p.getAddress(),
									p.getPhoneNumber() };
							model.addRow(data);
							i++;
						}
						table.setModel(model);
						table.getColumnModel().getColumn(1).setPreferredWidth(100);
						table.getColumnModel().getColumn(2).setPreferredWidth(200);
						table.getColumnModel().getColumn(3).setPreferredWidth(500);
						table.getColumnModel().getColumn(4).setPreferredWidth(100);

					}
				}
			}
		});

	}

	public Panel_TimNhaThuoc() {
		setBackground(new Color(70, 130, 180));
		setBounds(0, 0, 950, 623);
		setLayout(null);
		setVisible(true);

		comboBox_Cities.setBounds(110, 100, 175, 22);
		add(comboBox_Cities);

		comboBox_District.setBounds(400, 100, 175, 22);
		add(comboBox_District);

		button_Search.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_Search.setBackground(new Color(192, 192, 192));
		button_Search.setBounds(630, 90, 196, 43);
		button_Search.setIcon(new ImageIcon(img_Icon_Search));
		add(button_Search);

		JLabel label_TinhThanh = new JLabel("Tỉnh/Thành :");
		label_TinhThanh.setForeground(Color.WHITE);
		label_TinhThanh.setBounds(20, 100, 82, 15);
		add(label_TinhThanh);

		JLabel label_QuanHuyen = new JLabel("Quận/Huyện :");
		label_QuanHuyen.setForeground(Color.WHITE);
		label_QuanHuyen.setBounds(310, 100, 82, 15);
		add(label_QuanHuyen);

		JLabel label_TimNhaThuoc = new JLabel("Tìm nhà thuốc");
		label_TimNhaThuoc.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_TimNhaThuoc.setHorizontalAlignment(SwingConstants.CENTER);
		label_TimNhaThuoc.setBounds(0, 11, 950, 62);
		add(label_TimNhaThuoc);

		
		custom_model_table();
		custom_table_and_add_into_jscrollPane();
		when_click_in_ComboBox_Cities();
		action_before_when_click_button_Search();
		action_when_click_button_Search();
		

	}
}
