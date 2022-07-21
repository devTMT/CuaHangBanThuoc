package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panel_LichSuDatHang extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel_LichSuDatHang() {
		setBounds(0,0, 950, 623);
		setLayout(null);
		setVisible(true);

		JLabel lblNewLabel = new JLabel("Tính năng đang được phát triển");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(277, 290, 400, 65);
		add(lblNewLabel);

	}

}
