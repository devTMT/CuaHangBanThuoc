package view;

import java.awt.Font;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import model.Bill;
import model.ListAccount;
import model.PurchaseHistory;
import model.UserClient;

public class Panel_LichSuDatHang extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel labelLichSu;
	JTable table;
	DefaultTableModel model;
	public static Set<Bill> bills = new HashSet<Bill>();

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("serial")
	public Panel_LichSuDatHang() {
		setBounds(0, 0, 950, 623);
		setLayout(null);

		labelLichSu = new JLabel("Lịch sử đặt hàng");
		labelLichSu.setHorizontalAlignment(SwingConstants.CENTER);
		labelLichSu.setFont(new Font("Tahoma", Font.BOLD, 22));
		labelLichSu.setBounds(0, 11, 950, 62);
		add(labelLichSu);

		model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		JScrollPane sp = new JScrollPane();
		sp.setLocation(75, 154);
		sp.setSize(800, 400);
		add(sp);

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sp.setViewportView(table);

		model.addColumn("STT");
		model.addColumn("Mã đơn hàng");
		model.addColumn("Tổng tiền thanh toán");
		model.addColumn("Ngày mua hàng");
		model.addColumn("Ngày giao hàng");
		model.addColumn("Địa chỉ giao hàng");

		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(34);
		table.getColumnModel().getColumn(0).setMinWidth(34);
		table.getColumnModel().getColumn(0).setMaxWidth(34);
		table.getColumnModel().getColumn(1).setMaxWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setMaxWidth(110);
		table.getColumnModel().getColumn(2).setPreferredWidth(110);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(200);
		table.setRowHeight(30);
	}

	// Cập nhật lại màn hình
	public void update() {
		model.getDataVector().removeAllElements();
		ArrayList<Bill> bills = PurchaseHistory.listBill.getBills().get(Frame_SignIn.accountRuntime);
		if (bills == null) {
			return;
		}
		for (int i = 0; i < bills.size(); i++) {
			String[] data = { String.valueOf(i + 1), bills.get(i).getIdBill() + "",
					bills.get(i).totalValuePriceBill() + "", printDateCustom(bills.get(i).getDateBill()) + "",
					printDateCustom(bills.get(i).getDateDelivery()) + "",
					((UserClient) ListAccount.l_A.getList_Account().get(Frame_SignIn.accountRuntime))
							.getReceiveAddress() };
			model.addRow(data);
		}
	}
	
	// In ngày theo mẫu tùy chỉnh
	private String printDateCustom(GregorianCalendar calendar) {
		String date = calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" + calendar.get(GregorianCalendar.MONTH) + "/" + calendar.get(GregorianCalendar.YEAR);
		return date;
	}
	
}
