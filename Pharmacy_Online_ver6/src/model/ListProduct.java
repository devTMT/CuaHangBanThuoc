package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ListProduct implements SortProduct {

	public static ListProduct l_Product = new ListProduct();
	private Map<String, Set<Product>> listProducts_byName = new HashMap<>();

	public ListProduct() {

		addData_ThuocKhongKeDon();
		addData_ThucPhamDinhDuong();
		addData_DungCuSoCuu();
		addData_SanPhamPhongTam();
		addData_SanPhamKhuMui();
		addData_All();

	}

	void addData_All() {
		Set<Product> set_All = new HashSet<>();

		Product p1 = new Product_Drug("P24325", "3B STADA (Hộp 5 vỉ x 10 viên)", 77219, 77219, "Việt Nam", "Stada",
				"Điều trị các trường hợp thiếu vitamin B1, B6, B12 như: viêm đau dây thần kinh, bệnh lý dây thần kinh do thuốc, do nghiện rượu...");
		Product p2 = new Product_Drug("P17041", "AB Extra Bone-Care (Hộp 6 vỉ x 10 viên)", 480000, 384000, "Việt Nam",
				"", "");
		Product p3 = new Product_Drug("P15057", "Acegoi (Hộp 30 gói)", 45000, 45000, "Việt Nam", "Agimexpharm ",
				"Điều trị sốt, đau đầu, đau nhức cơ bắp, đau khớp...");
		Product p4 = new Product_Drug("P17322", "Acemol 500mg (10 vỉ x 10 viên)", 39900, 39900, "Việt Nam", "Nadyphar",
				"Hạ sốt và giảm đau, Đau nhức hệ cơ xương, nhức đầu, nhức răng, đau bụng kinh,...");
		Product p5 = new Product_Drug("P17315", "Acetylcystein 200 Imexpharm (10 vỉ x 10 viên)", 117000, 117000,
				"Việt Nam", "Imexpharm",
				"Điều trị các bệnh lý đường hô hấp có đờm nhầy quánh như viêm phế quản cấp và mạn.");
		Product p6 = new Product("P08401", "Sữa dinh dưỡng hương Vani Ensure Gold Vigor (237ml)", 49500, 49500,
				"Việt Nam", "Ensure",
				"Dinh dưỡng đầy đủ và cân đối dùng để thay thế hoàn toàn bữa ăn hoặc để bổ sung dinh dưỡng cho người lớn tuổi, người loãng xương hoặc có nguy cơ loãng xương, người có tăng chuyển hóa Canxi và Phốt pho.");
		Product p7 = new Product("P17815",
				"Thực phẩm dinh dưỡng y học hương Vani Abbott Ensure Plus Advance 220ml (Lốc 6 Chai)", 76000, 68400,
				"Việt Nam", "Ensure",
				"Bổ sung dinh dưỡng cho người lớn bị suy dinh dưỡng hoặc có nguy cơ thiếu dinh dưỡng");
		Product p8 = new Product("P07244",
				"Sữa bột dinh dưỡng cho người đái tháo đường hương Vani Abbott Glucerna (850g)", 823000, 823000,
				"Việt Nam", "",
				"Glucerna là sản phẩm dinh dưỡng đầy đủ và cân đối cho người đái tháo đường với công thức tiên tiến, hệ dưỡng chất đặc chế Triple Care được chứng minh lâm sàng giúp kiểm soát tốt đường huyết, tăng cường sức khỏe tim mạch.");
		Product p9 = new Product("P22189", "Sữa bột Anlene Gold 5X hương vani 800g", 489000, 489000, "Việt Nam",
				"Anlene",
				"Anlene Gold 5X ngoài chứa Đạm- Canxi-Collagen giúp hệ vận động cơ-xương-khớp khỏe mạnh, linh hoạt, dẽo dai, còn chứa đầy đủ các loại vitamin: A,B6,B12,C,D,Kẽm....giúp tăng cường sức đề kháng.\r\n"
						+ "Ngoài ra Anlene 5X chứa phức hợp dinh dưỡng với hoạt chất MFGM được kiểm nghiệm lâm sàng làm cải thiện: 40% khối cơ, 2 lần độ dẽo dai và 3 lần khả năng giữ thăng bằng cho cơ thể.");
		Product p10 = new Product(" P23314", "Đông trùng hạ thảo mật ong chín tổ Bonie Bee (hộp 250g)", 283800, 283800,
				"Việt Nam", "",
				"Đông trùng hạ thảo và mật ong đều là những vị thuốc quý, có công dụng rất tốt trong việc bồi bổ sức khỏe, ngăn ngừa một số bệnh lý, đặc biệt phù hợp với các chị em phụ nữ trong việc làm đẹp. Mật ong không chỉ đơn giản mang lại vị ngọt thanh dễ uống mà còn là chất xúc tác, giúp phát huy triệt để chất dinh dưỡng có trong đông trùng hạ thảo.");
		Product p11 = new Product(" P22985", "Miếng dán giảm đau xương khớp Bách Linh Diệu 10 miếng/hộp", 88000, 88000,
				"Việt Nam", "",
				"Miếng dán thảo dược giúp cải thiện tình trạng khó chịu như đau đầu, viêm khớp, đau dây thần kinh, thoát vị đĩa đệm, căng cơ, đau vai gáy, vết bầm tím, bong gân do va đập.");
		Product p12 = new Product("P01255", "Bông y tế thấm nước Bạch Tuyết (100g)", 21500, 19350, "Việt Nam", "",
				"Dùng làm thuốc sát trùng trước khi tiêm, lau rửa vết thương và thấm máu, vệ sinh cho em bé.");
		Product p13 = new Product("P00133", "Bông y tế thấm nước Bạch Tuyết (25g)", 6300, 6300, "Việt Nam", "",
				" Dùng làm thuốc sát trùng khi tiêm, lau rửa vết thương và thấm máu, vệ sinh cho em bé.");
		Product p14 = new Product("P20385", "Băng cá nhân che phủ vết thương Urgo Optiskin 10cm x 7cm (3 miếng)", 50000,
				50000, "Việt Nam", "Laboratories Urgo",
				"Optiskin là băng gạc sử dụng để bao phủ lên tất cả các vết thương ngoài da (vết khâu, vết trầy xước), hoặc các loại dụng cụ (que dò, ống dẫn...). Do Optiskin cho phép bệnh nhân có thể tắm rửa, vệ sinh nên băng đặc biệt phù hợp cho các liệu pháp tắm ngâm hay nói chung nhanh chóng bắt đầu lại các hoạt động sau phẫu thuật.");
		Product p15 = new Product("P21745", "Băng cá nhân dạng lỏng Urgo Filmo Gel Little Cut (3,25ml)", 95000, 95000,
				"Việt Nam", "Laboratories Urgo",
				"Công thức của sản phẩm tạo môi trường ẩm, thuận lợi cho việc lành thương. Sau khi bôi, một lớp màng sẽ được hình thành bao phủ lấy vùng da bị tổn thương và có thể co giãn linh hoạt, giúp:\r\n"
						+ "- Bảo vệ vết thương khỏi các tác nhân bên ngoài.\r\n" + "- Giảm đau.\r\n"
						+ "- Thúc đẩy lành vết thương.\r\n" + "- Không thấm nước.");
		Product p16 = new Product("P22613", "Sữa tắm ngăn ngừa mụn Acnes Body Shower (180g)", 79000, 71100, "Việt Nam",
				"", "Sữa tắm tẩy sạch chất nhờ, bụi bẩn và tế bào chết, kháng khuẩn và ngăn ngừa mụn toàn thân.");
		Product p17 = new Product("P23469", "Sữa tắm chuyên biệt cho mụn lưng và viêm nang lông Acnevir (Chai 210ml)",
				138000, 124200, "Việt Nam", "",
				"Dùng tắm hằng ngày; Giúp: làm sạch da toàn thân, loại bỏ bụi bẩn, dầu nhờn, tế bào chết trên da, làm thông thoáng lỗ chân lông, duy trì độ ẩm và pH tự nhiên, cho làn da trắng sạch, mịn màng hơn; Góp phần ngăn ngừa và cải thiện tình trạng mụn, viêm lỗ chân lông trên da tại các vùng lưng, ngực, mông, ...");
		Product p18 = new Product("P22674", "Aveeno sữa tắm dưỡng ẩm hằng ngày 345ml", 240000, 240000, "Việt Nam",
				"Aveeno ", "Sản phẩm dùng để tắm");
		Product p19 = new Product("P22270", "Bọt rửa tay kháng khuẩn hương khuynh diệp Biore Guard (Chai 250ml)", 89000,
				75650, "Việt Nam", "", "Làm sạch da tay, kháng khuẩn");
		Product p20 = new Product("P18800", "Bông tắm dành cho trẻ em Mee Bath (nhiều màu)", 28500, 28500, "Việt Nam",
				"", "");
		Product p21 = new Product("P23487", "Lăn khử mùi đá khoáng dạng sáp cho mọi loại da Deonatulle (20g)", 298000,
				298000, "Việt Nam", "", "Khử mùi đá khoáng, sạch tháng gấp đôi.\r\n" + "\r\n"
						+ "Giúp giảm mồ hôi và bã nhờn, ngăn vi khuẩn gây mùi.");
		Product p22 = new Product("P22614", "Kem khử mùi Collagen & Vitamin B3 sáng mịn đều màu Dove (Tuýp 50ml)",
				88000, 88000, "Việt Nam", "",
				"- Tái tạo và củng cố độ đàn hồi làn da dưới cánh tay từ sâu bên trong, cho da vẻ mịn màng\r\n" + "\r\n"
						+ "- Chống các gốc tự do, làm giảm nếp nhăn, tăng độ đàn hồi và săn chắc cho da\r\n" + "\r\n"
						+ "- Ngăn mùi cơ thể, giảm tiết mồ hôi, giúp làn da dưới cánh tay khô thoáng 48 giờ");
		Product p23 = new Product("P23490",
				"Kem khử mùi tinh chất Serum Dove Collagen + Vitamin E Deodorant Dry Serum Intensive Renew Collagen + Vitamin E (Chai 50ml)",
				88000, 88000, "Việt Nam", "",
				"- Vitamin E giúp chống oxy hóa, giảm tình trạng lỗ chân lông giãn nở, se khít lỗ chân lông giúp nâng đỡ cấu trúc da, duy trì sự căng mịn tự nhiên.\r\n"
						+ "- Thành phần collagen giúp làm mờ nếp nhăn, làm đầy các rành, giúp vùng da dưới cánh tay mịn màng, sáng mượt.\r\n"
						+ "- Kết cấu siêu phân tử serum, giúp sản phẩm thẩm thấu tận 20 lớp da dưới cánh tay từ sâu bên trong.\r\n"
						+ "- Khô nhanh gấp 2 lần so với chai lăn thông thường, không gây cảm giác nhờn rít khi sử dụng, không gây vệt ố vàng.\r\n"
						+ "- Giảm mồ hôi, giúp làn da dưới cánh tay khô thoáng 48 giờ.");
		Product p24 = new Product("P07044", "Lăn khử mùi Dove Go Fresh (40ml)", 69000, 62100, "Việt Nam", "",
				"Dùng để ngăn mùi cơ thể");
		Product p25 = new Product("P03680", "Lăn khử mùi trắng da hương nước hoa Pháp Enchantuer Charming (50ml)",
				83000, 66400, "Việt Nam", "", "Khử mùi cơ thể, giảm tiết mồ hôi.");

		set_All.add(p25);
		set_All.add(p24);
		set_All.add(p23);
		set_All.add(p22);
		set_All.add(p21);
		set_All.add(p20);
		set_All.add(p19);
		set_All.add(p18);
		set_All.add(p17);
		set_All.add(p16);
		set_All.add(p15);
		set_All.add(p14);
		set_All.add(p13);
		set_All.add(p12);
		set_All.add(p11);
		set_All.add(p10);
		set_All.add(p9);
		set_All.add(p8);
		set_All.add(p7);
		set_All.add(p6);
		set_All.add(p5);
		set_All.add(p4);
		set_All.add(p3);
		set_All.add(p2);
		set_All.add(p1);
		
		listProducts_byName.put("Tất cả", set_All);

	}

	void addData_ThuocKhongKeDon() {

		Set<Product> set_ThuocKhongKeDon = new HashSet<>();
		Product p1 = new Product_Drug("P24325", "3B STADA (Hộp 5 vỉ x 10 viên)", 77219, 77219, "Việt Nam", "Stada",
				"Điều trị các trường hợp thiếu vitamin B1, B6, B12 như: viêm đau dây thần kinh, bệnh lý dây thần kinh do thuốc, do nghiện rượu...");
		Product p2 = new Product_Drug("P17041", "AB Extra Bone-Care (Hộp 6 vỉ x 10 viên)", 480000, 384000, "Việt Nam",
				"", "");
		Product p3 = new Product_Drug("P15057", "Acegoi (Hộp 30 gói)", 45000, 45000, "Việt Nam", "Agimexpharm ",
				"Điều trị sốt, đau đầu, đau nhức cơ bắp, đau khớp...");
		Product p4 = new Product_Drug("P17322", "Acemol 500mg (10 vỉ x 10 viên)", 39900, 39900, "Việt Nam", "Nadyphar",
				"Hạ sốt và giảm đau, Đau nhức hệ cơ xương, nhức đầu, nhức răng, đau bụng kinh,...");
		Product p5 = new Product_Drug("P17315", "Acetylcystein 200 Imexpharm (10 vỉ x 10 viên)", 117000, 117000,
				"Việt Nam", "Imexpharm",
				"Điều trị các bệnh lý đường hô hấp có đờm nhầy quánh như viêm phế quản cấp và mạn.");

		set_ThuocKhongKeDon.add(p1);
		set_ThuocKhongKeDon.add(p2);
		set_ThuocKhongKeDon.add(p3);
		set_ThuocKhongKeDon.add(p4);
		set_ThuocKhongKeDon.add(p5);

		listProducts_byName.put("Thuốc không kê đơn", set_ThuocKhongKeDon);

	}

	void addData_ThucPhamDinhDuong() {

		Set<Product> set_ThucPhamDinhDuong = new HashSet<>();
		Product p1 = new Product("P08401", "Sữa dinh dưỡng hương Vani Ensure Gold Vigor (237ml)", 49500, 49500,
				"Việt Nam", "Ensure",
				"Dinh dưỡng đầy đủ và cân đối dùng để thay thế hoàn toàn bữa ăn hoặc để bổ sung dinh dưỡng cho người lớn tuổi, người loãng xương hoặc có nguy cơ loãng xương, người có tăng chuyển hóa Canxi và Phốt pho.");
		Product p2 = new Product("P17815",
				"Thực phẩm dinh dưỡng y học hương Vani Abbott Ensure Plus Advance 220ml (Lốc 6 Chai)", 76000, 68400,
				"Việt Nam", "Ensure",
				"Bổ sung dinh dưỡng cho người lớn bị suy dinh dưỡng hoặc có nguy cơ thiếu dinh dưỡng");
		Product p3 = new Product("P07244",
				"Sữa bột dinh dưỡng cho người đái tháo đường hương Vani Abbott Glucerna (850g)", 823000, 823000,
				"Việt Nam", "",
				"Glucerna là sản phẩm dinh dưỡng đầy đủ và cân đối cho người đái tháo đường với công thức tiên tiến, hệ dưỡng chất đặc chế Triple Care được chứng minh lâm sàng giúp kiểm soát tốt đường huyết, tăng cường sức khỏe tim mạch.");
		Product p4 = new Product("P22189", "Sữa bột Anlene Gold 5X hương vani 800g", 489000, 489000, "Việt Nam",
				"Anlene",
				"Anlene Gold 5X ngoài chứa Đạm- Canxi-Collagen giúp hệ vận động cơ-xương-khớp khỏe mạnh, linh hoạt, dẽo dai, còn chứa đầy đủ các loại vitamin: A,B6,B12,C,D,Kẽm....giúp tăng cường sức đề kháng.\r\n"
						+ "Ngoài ra Anlene 5X chứa phức hợp dinh dưỡng với hoạt chất MFGM được kiểm nghiệm lâm sàng làm cải thiện: 40% khối cơ, 2 lần độ dẽo dai và 3 lần khả năng giữ thăng bằng cho cơ thể.");
		Product p5 = new Product(" P23314", "Đông trùng hạ thảo mật ong chín tổ Bonie Bee (hộp 250g)", 283800, 283800,
				"Việt Nam", "",
				"Đông trùng hạ thảo và mật ong đều là những vị thuốc quý, có công dụng rất tốt trong việc bồi bổ sức khỏe, ngăn ngừa một số bệnh lý, đặc biệt phù hợp với các chị em phụ nữ trong việc làm đẹp. Mật ong không chỉ đơn giản mang lại vị ngọt thanh dễ uống mà còn là chất xúc tác, giúp phát huy triệt để chất dinh dưỡng có trong đông trùng hạ thảo.");

		set_ThucPhamDinhDuong.add(p5);
		set_ThucPhamDinhDuong.add(p4);
		set_ThucPhamDinhDuong.add(p3);
		set_ThucPhamDinhDuong.add(p2);
		set_ThucPhamDinhDuong.add(p1);

		listProducts_byName.put("Thực phẩm dinh dưỡng", set_ThucPhamDinhDuong);

	}

	void addData_DungCuSoCuu() {

		Set<Product> set_DungCuSoCuu = new HashSet<>();
		Product p1 = new Product(" P22985", "Miếng dán giảm đau xương khớp Bách Linh Diệu 10 miếng/hộp", 88000, 88000,
				"Việt Nam", "",
				"Miếng dán thảo dược giúp cải thiện tình trạng khó chịu như đau đầu, viêm khớp, đau dây thần kinh, thoát vị đĩa đệm, căng cơ, đau vai gáy, vết bầm tím, bong gân do va đập.");
		Product p2 = new Product("P01255", "Bông y tế thấm nước Bạch Tuyết (100g)", 21500, 19350, "Việt Nam", "",
				"Dùng làm thuốc sát trùng trước khi tiêm, lau rửa vết thương và thấm máu, vệ sinh cho em bé.");
		Product p3 = new Product("P00133", "Bông y tế thấm nước Bạch Tuyết (25g)", 6300, 6300, "Việt Nam", "",
				" Dùng làm thuốc sát trùng khi tiêm, lau rửa vết thương và thấm máu, vệ sinh cho em bé.");
		Product p4 = new Product("P20385", "Băng cá nhân che phủ vết thương Urgo Optiskin 10cm x 7cm (3 miếng)", 50000,
				50000, "Việt Nam", "Laboratories Urgo",
				"Optiskin là băng gạc sử dụng để bao phủ lên tất cả các vết thương ngoài da (vết khâu, vết trầy xước), hoặc các loại dụng cụ (que dò, ống dẫn...). Do Optiskin cho phép bệnh nhân có thể tắm rửa, vệ sinh nên băng đặc biệt phù hợp cho các liệu pháp tắm ngâm hay nói chung nhanh chóng bắt đầu lại các hoạt động sau phẫu thuật.");
		Product p5 = new Product("P21745", "Băng cá nhân dạng lỏng Urgo Filmo Gel Little Cut (3,25ml)", 95000, 95000,
				"Việt Nam", "Laboratories Urgo",
				"Công thức của sản phẩm tạo môi trường ẩm, thuận lợi cho việc lành thương. Sau khi bôi, một lớp màng sẽ được hình thành bao phủ lấy vùng da bị tổn thương và có thể co giãn linh hoạt, giúp:\r\n"
						+ "- Bảo vệ vết thương khỏi các tác nhân bên ngoài.\r\n" + "- Giảm đau.\r\n"
						+ "- Thúc đẩy lành vết thương.\r\n" + "- Không thấm nước.");

		set_DungCuSoCuu.add(p5);
		set_DungCuSoCuu.add(p4);
		set_DungCuSoCuu.add(p3);
		set_DungCuSoCuu.add(p2);
		set_DungCuSoCuu.add(p1);

		listProducts_byName.put("Dụng cụ sơ cứu", set_DungCuSoCuu);

	}

	void addData_SanPhamPhongTam() {

		Set<Product> set_SanPhamPhongTam = new HashSet<>();
		Product p1 = new Product("P22613", "Sữa tắm ngăn ngừa mụn Acnes Body Shower (180g)", 79000, 71100, "Việt Nam",
				"", "Sữa tắm tẩy sạch chất nhờ, bụi bẩn và tế bào chết, kháng khuẩn và ngăn ngừa mụn toàn thân.");
		Product p2 = new Product("P23469", "Sữa tắm chuyên biệt cho mụn lưng và viêm nang lông Acnevir (Chai 210ml)",
				138000, 124200, "Việt Nam", "",
				"Dùng tắm hằng ngày; Giúp: làm sạch da toàn thân, loại bỏ bụi bẩn, dầu nhờn, tế bào chết trên da, làm thông thoáng lỗ chân lông, duy trì độ ẩm và pH tự nhiên, cho làn da trắng sạch, mịn màng hơn; Góp phần ngăn ngừa và cải thiện tình trạng mụn, viêm lỗ chân lông trên da tại các vùng lưng, ngực, mông, ...");
		Product p3 = new Product("P22674", "Aveeno sữa tắm dưỡng ẩm hằng ngày 345ml", 240000, 240000, "Việt Nam",
				"Aveeno ", "Sản phẩm dùng để tắm");
		Product p4 = new Product("P22270", "Bọt rửa tay kháng khuẩn hương khuynh diệp Biore Guard (Chai 250ml)", 89000,
				75650, "Việt Nam", "", "Làm sạch da tay, kháng khuẩn");
		Product p5 = new Product("P18800", "Bông tắm dành cho trẻ em Mee Bath (nhiều màu)", 28500, 28500, "Việt Nam",
				"", "");

		set_SanPhamPhongTam.add(p1);
		set_SanPhamPhongTam.add(p2);
		set_SanPhamPhongTam.add(p3);
		set_SanPhamPhongTam.add(p4);
		set_SanPhamPhongTam.add(p5);

		listProducts_byName.put("Sản phẩm phòng tắm", set_SanPhamPhongTam);

	}

	void addData_SanPhamKhuMui() {

		Set<Product> set_SanPhamKhuMui = new HashSet<>();
		Product p1 = new Product("P23487", "Lăn khử mùi đá khoáng dạng sáp cho mọi loại da Deonatulle (20g)", 298000,
				298000, "Việt Nam", "", "Khử mùi đá khoáng, sạch tháng gấp đôi.\r\n" + "\r\n"
						+ "Giúp giảm mồ hôi và bã nhờn, ngăn vi khuẩn gây mùi.");
		Product p2 = new Product("P22614", "Kem khử mùi Collagen & Vitamin B3 sáng mịn đều màu Dove (Tuýp 50ml)", 88000,
				88000, "Việt Nam", "",
				"- Tái tạo và củng cố độ đàn hồi làn da dưới cánh tay từ sâu bên trong, cho da vẻ mịn màng\r\n" + "\r\n"
						+ "- Chống các gốc tự do, làm giảm nếp nhăn, tăng độ đàn hồi và săn chắc cho da\r\n" + "\r\n"
						+ "- Ngăn mùi cơ thể, giảm tiết mồ hôi, giúp làn da dưới cánh tay khô thoáng 48 giờ");
		Product p3 = new Product("P23490",
				"Kem khử mùi tinh chất Serum Dove Collagen + Vitamin E Deodorant Dry Serum Intensive Renew Collagen + Vitamin E (Chai 50ml)",
				88000, 88000, "Việt Nam", "",
				"- Vitamin E giúp chống oxy hóa, giảm tình trạng lỗ chân lông giãn nở, se khít lỗ chân lông giúp nâng đỡ cấu trúc da, duy trì sự căng mịn tự nhiên.\r\n"
						+ "- Thành phần collagen giúp làm mờ nếp nhăn, làm đầy các rành, giúp vùng da dưới cánh tay mịn màng, sáng mượt.\r\n"
						+ "- Kết cấu siêu phân tử serum, giúp sản phẩm thẩm thấu tận 20 lớp da dưới cánh tay từ sâu bên trong.\r\n"
						+ "- Khô nhanh gấp 2 lần so với chai lăn thông thường, không gây cảm giác nhờn rít khi sử dụng, không gây vệt ố vàng.\r\n"
						+ "- Giảm mồ hôi, giúp làn da dưới cánh tay khô thoáng 48 giờ.");
		Product p4 = new Product("P07044", "Lăn khử mùi Dove Go Fresh (40ml)", 69000, 62100, "Việt Nam", "",
				"Dùng để ngăn mùi cơ thể");
		Product p5 = new Product("P03680", "Lăn khử mùi trắng da hương nước hoa Pháp Enchantuer Charming (50ml)", 83000,
				66400, "Việt Nam", "", "Khử mùi cơ thể, giảm tiết mồ hôi.");

		set_SanPhamKhuMui.add(p1);
		set_SanPhamKhuMui.add(p2);
		set_SanPhamKhuMui.add(p3);
		set_SanPhamKhuMui.add(p4);
		set_SanPhamKhuMui.add(p5);

		listProducts_byName.put("Sản phẩm khử mùi", set_SanPhamKhuMui);

	}

	public ListProduct(Map<String, Set<Product>> listProducts_byName) {
		super();
		this.listProducts_byName = listProducts_byName;
	}

	public Map<String, Set<Product>> getListProducts_byName() {
		return listProducts_byName;
	}

	public void setListProducts_byName(Map<String, Set<Product>> listProducts_byName) {
		this.listProducts_byName = listProducts_byName;
	}

	@Override
	public TreeSet<Product> sort_Ascending_PromationalPrice(String nameTypeProduct) {
		// TODO Auto-generated method stub

		Set<Product> setProduct = (HashSet<Product>) listProducts_byName.get(nameTypeProduct);
		SortedSet<Product> sorted = new TreeSet<>(new Sort_Ascending_PromotionalPrice());
		sorted.addAll(setProduct);

		return (TreeSet<Product>) sorted;

	}

	@Override
	public TreeSet<Product> sort_Descending_PromotionalPrice(String nameTypeProduct) {
		// TODO Auto-generated method stub
		Set<Product> setProduct = (HashSet<Product>) listProducts_byName.get(nameTypeProduct);
		SortedSet<Product> sorted = new TreeSet<>(new Sort_Descending_PromotionalPrice());
		sorted.addAll(setProduct);

		return (TreeSet<Product>) sorted;
	}

	@Override
	public TreeSet<Product> sort_newProduct(String nameTypeProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	// lấy ra danh sách các sản phẩm theo tên loại sản phẩm đó
	public Set<Product> search_Products_byNameType(String nameTypeProduct) {

		return listProducts_byName.get(nameTypeProduct);
	}

}
