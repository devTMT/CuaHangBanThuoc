package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ListPharmacy {

	/*
	 * key : tên thành phố và quận , value : tập hợp các nhà thuốc
	 */

	public static ListPharmacy l_P = new ListPharmacy();
	private HashMap<String, Set<Pharmacy>> list_Pharmacies = new HashMap<>();

	public ListPharmacy() {

		add_Data_TPHCM();
		add_Data_HaNoi();
		add_Data_NamDinh();

	}

	void add_Data_TPHCM() {
		Pharmacy p1 = new Pharmacy("NHC", "Nguyễn Hữu Cầu", "0927042108",
				"77 Nguyễn Hữu Cầu,Phường Tân Định,Quận 1,Thành phố Hồ Chí Minh");
		Pharmacy p2 = new Pharmacy("PHT", "Phạm Hồng Thái", "0927042108",
				"102 Phạm Hồng Thái,Phường Bến Thành,Quận 1,Thành phố Hồ Chí Minh");
		Pharmacy p3 = new Pharmacy("TCV", "Trần Cao Vân", "0927042108",
				"136 Hai Bà Trưng,Phường Đa Kao,Quận 1,Thành phố Hồ Chí Minh");
		Pharmacy p4 = new Pharmacy("SGPMC035", "Phạm Ngũ Lão", "0927042108",
				"173 Phạm Ngũ Lão, Phường Phạm Ngũ Lão,Quận 1,Thành phố Hồ Chí Minh");
		Pharmacy p5 = new Pharmacy("SGPMC046", "Hải Triều", "0927042108",
				"19 Hải Triều ,Phường Bến Nghé,Quận 1,Thành phố Hồ Chí Minh");
		Pharmacy p6 = new Pharmacy("TDN", "Thảo Điền", "0379342981",
				"Số 10 Thảo Điền,Phường Thảo Điền,Quận 2,Thành phố Hồ Chí Minh");
		Pharmacy p7 = new Pharmacy("SGPMC077", "02 Trúc Đường", "0927042108",
				"02 Trúc Đường,Phường Thảo Điền,Quận 2,Thành phố Hồ Chí Minh");
		Pharmacy p8 = new Pharmacy("SGPMC095", "670 Nguyễn Thị Định", "0379342981",
				"670 Nguyễn Thị Định,Phường Thạnh Mỹ Lợi,Quận 2,Thành phố Hồ Chí Minh");
		Pharmacy p9 = new Pharmacy("SGPMC118", "83 Nguyễn Duy Trinh", "0927042108",
				"83 Nguyễn Duy Trinh,Phường Bình Trưng Tây,Quận 2,Thành phố Hồ Chí Minh");
		Pharmacy p10 = new Pharmacy("SGPMC153", "403 Nguyễn Duy Trinh", "0379342981",
				"403 Nguyễn Duy Trinh,Phường Bình Trưng Đông,Quận 2,Thành phố Hồ Chí Minh");
		Pharmacy p11 = new Pharmacy("LVS", "Lê Văn Sỹ", "0379342981",
				"372 Lê Văn Sỹ,Phường 14,Quận 3,Thành phố Hồ Chí Minh");
		Pharmacy p12 = new Pharmacy("PAS", "Pasteur", "0927042108",
				"188 Pasteur,Phường 06,Quận 3,Thành phố Hồ Chí Minh");
		Pharmacy p13 = new Pharmacy("SGPMC038", "Nguyễn Đình Chiểu", "0379342981",
				" 410 Nguyễn Đình Chiểu,Phường 04,Quận 3,Thành phố Hồ Chí Minh");
		Pharmacy p14 = new Pharmacy("SGPMC037", "Nguyễn Thiện Thuật", "0927042108",
				" 249 Nguyễn Thiện Thuật,Phường 01,Quận 3,Thành phố Hồ Chí Minh");
		Pharmacy p15 = new Pharmacy("SGPMC055", "230/17 Bis Nguyen Thien Thuat", "0379342981",
				" 213/17 Bis Nguyễn Thiện Thuật,Phường 01,Quận 3,Thành phố Hồ Chí Minh");
		Pharmacy p16 = new Pharmacy("NHC", "Nguyễn Hữu Cầu", "0927042108",
				"77 Nguyễn Hữu Cầu,Phường Tân Định,Quận 4,Thành phố Hồ Chí Minh");
		Pharmacy p17 = new Pharmacy("PHT", "Phạm Hồng Thái", "0927042108",
				"102 Phạm Hồng Thái,Phường Bến Thành,Quận 4,Thành phố Hồ Chí Minh");
		Pharmacy p18 = new Pharmacy("TCV", "Trần Cao Vân", "0927042108",
				"136 Hai Bà Trưng,Phường Đa Kao,Quận 4,Thành phố Hồ Chí Minh");
		Pharmacy p19 = new Pharmacy("SGPMC035", "Phạm Ngũ Lão", "0927042108",
				"173 Phạm Ngũ Lão, Phường Phạm Ngũ Lão,Quận 4,Thành phố Hồ Chí Minh");
		Pharmacy p20 = new Pharmacy("SGPMC046", "Hải Triều", "0927042108",
				"19 Hải Triều ,Phường Bến Nghé,Quận 4,Thành phố Hồ Chí Minh");
		Pharmacy p21 = new Pharmacy("TDN", "Thảo Điền", "0379342981",
				"Số 10 Thảo Điền,Phường Thảo Điền,Quận 5,Thành phố Hồ Chí Minh");
		Pharmacy p22 = new Pharmacy("SGPMC077", "02 Trúc Đường", "0927042108",
				"02 Trúc Đường,Phường Thảo Điền,Quận 5,Thành phố Hồ Chí Minh");
		Pharmacy p23 = new Pharmacy("SGPMC095", "670 Nguyễn Thị Định", "0379342981",
				"670 Nguyễn Thị Định,Phường Thạnh Mỹ Lợi,Quận 5,Thành phố Hồ Chí Minh");
		Pharmacy p24 = new Pharmacy("SGPMC118", "83 Nguyễn Duy Trinh", "0927042108",
				"83 Nguyễn Duy Trinh,Phường Bình Trưng Tây,Quận 5,Thành phố Hồ Chí Minh");
		Pharmacy p25 = new Pharmacy("SGPMC153", "403 Nguyễn Duy Trinh", "0379342981",
				"403 Nguyễn Duy Trinh,Phường Bình Trưng Đông,Quận 5,Thành phố Hồ Chí Minh");

		Set<Pharmacy> set_q1 = new HashSet<>();
		Set<Pharmacy> set_q2 = new HashSet<>();
		Set<Pharmacy> set_q3 = new HashSet<>();
		Set<Pharmacy> set_q4 = new HashSet<>();
		Set<Pharmacy> set_q5 = new HashSet<>();

		set_q1.add(p1);
		set_q1.add(p2);
		set_q1.add(p3);
		set_q1.add(p4);
		set_q1.add(p5);

		set_q2.add(p6);
		set_q2.add(p7);
		set_q2.add(p8);
		set_q2.add(p9);
		set_q2.add(p10);

		set_q3.add(p11);
		set_q3.add(p12);
		set_q3.add(p13);
		set_q3.add(p14);
		set_q3.add(p15);

		set_q4.add(p16);
		set_q4.add(p17);
		set_q4.add(p18);
		set_q4.add(p19);
		set_q4.add(p20);

		set_q5.add(p21);
		set_q5.add(p22);
		set_q5.add(p23);
		set_q5.add(p24);
		set_q5.add(p25);

		list_Pharmacies.put("Quận 1,TP.Hồ Chí Minh", set_q1);
		list_Pharmacies.put("Quận 2,TP.Hồ Chí Minh", set_q2);
		list_Pharmacies.put("Quận 3,TP.Hồ Chí Minh", set_q3);
		list_Pharmacies.put("Quận 4,TP.Hồ Chí Minh", set_q4);
		list_Pharmacies.put("Quận 5,TP.Hồ Chí Minh", set_q5);

	}

	void add_Data_HaNoi() {
		Set<Pharmacy> set_txSonTay_HaNoi = new HashSet<>();
		Set<Pharmacy> set_qHoanKiem_HaNoi = new HashSet<>();
		Set<Pharmacy> set_qDongDa_HaNoi = new HashSet<>();
		Set<Pharmacy> set_qBaDinh_HaNoi = new HashSet<>();
		Set<Pharmacy> set_qHaiBaTrung_HaNoi = new HashSet<>();

		Pharmacy p1 = new Pharmacy("NHC", "Nguyễn Hữu Cầu", "0927042108",
				"77 Nguyễn Hữu Cầu,Phường Tân Định,Thị xã Sơn Tây,Hà Nội");
		Pharmacy p2 = new Pharmacy("PHT", "Phạm Hồng Thái", "0927042108",
				"102 Phạm Hồng Thái,Phường Bến Thành,Thị xã Sơn Tây,Hà Nội");
		Pharmacy p3 = new Pharmacy("TCV", "Trần Cao Vân", "0927042108",
				"136 Hai Bà Trưng,Phường Đa Kao,Thị xã Sơn Tây,Hà Nội");
		Pharmacy p4 = new Pharmacy("SGPMC035", "Phạm Ngũ Lão", "0927042108",
				"173 Phạm Ngũ Lão, Phường Phạm Ngũ Lão,Thị xã Sơn Tây,Hà Nội");
		Pharmacy p5 = new Pharmacy("SGPMC046", "Hải Triều", "0927042108",
				"19 Hải Triều ,Phường Bến Nghé,Thị xã Sơn Tây,Hà Nội");
		Pharmacy p6 = new Pharmacy("TDN", "Thảo Điền", "0379342981",
				"Số 10 Thảo Điền,Phường Thảo Điền,Quận Hoàn Kiếm,Hà Nội");
		Pharmacy p7 = new Pharmacy("SGPMC077", "02 Trúc Đường", "0927042108",
				"02 Trúc Đường,Phường Thảo Điền,Quận Hoàn Kiếm,Hà Nội");
		Pharmacy p8 = new Pharmacy("SGPMC095", "670 Nguyễn Thị Định", "0379342981",
				"670 Nguyễn Thị Định,Phường Thạnh Mỹ Lợi,Quận Hoàn Kiếm,Hà Nội");
		Pharmacy p9 = new Pharmacy("SGPMC118", "83 Nguyễn Duy Trinh", "0927042108",
				"83 Nguyễn Duy Trinh,Phường Bình Trưng Tây,Quận Hoàn Kiếm,Hà Nội");
		Pharmacy p10 = new Pharmacy("SGPMC153", "403 Nguyễn Duy Trinh", "0379342981",
				"403 Nguyễn Duy Trinh,Phường Bình Trưng Đông,Quận Hoàn Kiếm,Hà Nội");
		Pharmacy p11 = new Pharmacy("LVS", "Lê Văn Sỹ", "0379342981",
				"372 Lê Văn Sỹ,Phường 14,Quận Đống Đa,Hà Nội");
		Pharmacy p12 = new Pharmacy("PAS", "Pasteur", "0927042108",
				"188 Pasteur,Phường 06,Quận Đống Đa,Hà Nội");
		Pharmacy p13 = new Pharmacy("SGPMC038", "Nguyễn Đình Chiểu", "0379342981",
				" 410 Nguyễn Đình Chiểu,Phường 04,Quận Đống Đa,Hà Nội");
		Pharmacy p14 = new Pharmacy("SGPMC037", "Nguyễn Thiện Thuật", "0927042108",
				" 249 Nguyễn Thiện Thuật,Phường 01,Quận Đống Đa,Hà Nội");
		Pharmacy p15 = new Pharmacy("SGPMC055", "230/17 Bis Nguyen Thien Thuat", "0379342981",
				" 213/17 Bis Nguyễn Thiện Thuật,Phường 01,Quận Đống Đa,Hà Nội");
		Pharmacy p16 = new Pharmacy("NHC", "Nguyễn Hữu Cầu", "0927042108",
				"77 Nguyễn Hữu Cầu,Phường Tân Định,Quận Ba Đình,Hà Nội");
		Pharmacy p17 = new Pharmacy("PHT", "Phạm Hồng Thái", "0927042108",
				"102 Phạm Hồng Thái,Phường Bến Thành,Quận Ba Đình,Hà Nội");
		Pharmacy p18 = new Pharmacy("TCV", "Trần Cao Vân", "0927042108",
				"136 Hai Bà Trưng,Phường Đa Kao,Quận Ba Đình,Hà Nội");
		Pharmacy p19 = new Pharmacy("SGPMC035", "Phạm Ngũ Lão", "0927042108",
				"173 Phạm Ngũ Lão, Phường Phạm Ngũ Lão,Quận Ba Đình,Hà Nội");
		Pharmacy p20 = new Pharmacy("SGPMC046", "Hải Triều", "0927042108",
				"19 Hải Triều ,Phường Bến Nghé,Quận Ba Đình,Hà Nội");
		Pharmacy p21 = new Pharmacy("TDN", "Thảo Điền", "0379342981",
				"Số 10 Thảo Điền,Phường Thảo Điền,Quận Hai Bà Trưng,Hà Nội");
		Pharmacy p22 = new Pharmacy("SGPMC077", "02 Trúc Đường", "0927042108",
				"02 Trúc Đường,Phường Thảo Điền,Quận Hai Bà Trưng,Hà Nội");
		Pharmacy p23 = new Pharmacy("SGPMC095", "670 Nguyễn Thị Định", "0379342981",
				"670 Nguyễn Thị Định,Phường Thạnh Mỹ Lợi,Quận Hai Bà Trưng,Hà Nội");
		Pharmacy p24 = new Pharmacy("SGPMC118", "83 Nguyễn Duy Trinh", "0927042108",
				"83 Nguyễn Duy Trinh,Phường Bình Trưng Tây,Quận Hai Bà Trưng,Hà Nội");
		Pharmacy p25 = new Pharmacy("SGPMC153", "403 Nguyễn Duy Trinh", "0379342981",
				"403 Nguyễn Duy Trinh,Phường Bình Trưng Đông,Quận Hai Bà Trưng,Hà Nội");
		set_txSonTay_HaNoi.add(p1);
		set_txSonTay_HaNoi.add(p2);
		set_txSonTay_HaNoi.add(p3);
		set_txSonTay_HaNoi.add(p4);
		set_txSonTay_HaNoi.add(p5);

		set_qHoanKiem_HaNoi.add(p6);
		set_qHoanKiem_HaNoi.add(p7);
		set_qHoanKiem_HaNoi.add(p8);
		set_qHoanKiem_HaNoi.add(p9);
		set_qHoanKiem_HaNoi.add(p10);

		set_qDongDa_HaNoi.add(p11);
		set_qDongDa_HaNoi.add(p12);
		set_qDongDa_HaNoi.add(p13);
		set_qDongDa_HaNoi.add(p14);
		set_qDongDa_HaNoi.add(p15);

		set_qBaDinh_HaNoi.add(p16);
		set_qBaDinh_HaNoi.add(p17);
		set_qBaDinh_HaNoi.add(p18);
		set_qBaDinh_HaNoi.add(p19);
		set_qBaDinh_HaNoi.add(p20);

		set_qHaiBaTrung_HaNoi.add(p21);
		set_qHaiBaTrung_HaNoi.add(p22);
		set_qHaiBaTrung_HaNoi.add(p23);
		set_qHaiBaTrung_HaNoi.add(p24);
		set_qHaiBaTrung_HaNoi.add(p25);

		list_Pharmacies.put("Thị xã Sơn Tây,Hà Nội", set_txSonTay_HaNoi);
		list_Pharmacies.put("Quận Hoàn Kiếm,Hà Nội", set_qHoanKiem_HaNoi);
		list_Pharmacies.put("Quận Đống Đa,Hà Nội", set_qDongDa_HaNoi);
		list_Pharmacies.put("Quận Ba Đình,Hà Nội", set_qBaDinh_HaNoi);
		list_Pharmacies.put("Quận Hai Bà Trưng,Hà Nội", set_qHaiBaTrung_HaNoi);


	}

	void add_Data_NamDinh() {
		Set<Pharmacy> set_tpNamDinh = new HashSet<>();
		Set<Pharmacy> set_hMyLoc = new HashSet<>();
		Set<Pharmacy> set_hVuBan = new HashSet<>();
		Set<Pharmacy> set_hYYen = new HashSet<>();
		Set<Pharmacy> set_hNghiaHung = new HashSet<>();

		Pharmacy p1 = new Pharmacy("NHC", "Nguyễn Hữu Cầu", "0927042108",
				"77 Nguyễn Hữu Cầu,Phường Tân Định,Tp.Nam Định,Tỉnh Nam Định");
		Pharmacy p2 = new Pharmacy("PHT", "Phạm Hồng Thái", "0927042108",
				"102 Phạm Hồng Thái,Phường Bến Thành,Tp.Nam Định,Tỉnh Nam Định");
		Pharmacy p3 = new Pharmacy("TCV", "Trần Cao Vân", "0927042108",
				"136 Hai Bà Trưng,Phường Đa Kao,Tp.Nam Định,Tỉnh Nam Định");
		Pharmacy p4 = new Pharmacy("SGPMC035", "Phạm Ngũ Lão", "0927042108",
				"173 Phạm Ngũ Lão, Phường Phạm Ngũ Lão,Tp.Nam Định,Tỉnh Nam Định");
		Pharmacy p5 = new Pharmacy("SGPMC046", "Hải Triều", "0927042108",
				"19 Hải Triều ,Phường Bến Nghé,Tp.Nam Định,Tỉnh Nam Định");
		Pharmacy p6 = new Pharmacy("TDN", "Thảo Điền", "0379342981",
				"Số 10 Thảo Điền,Phường Thảo Điền,Huyện Mỹ Lộc,Tỉnh Nam Định");
		Pharmacy p7 = new Pharmacy("SGPMC077", "02 Trúc Đường", "0927042108",
				"02 Trúc Đường,Phường Thảo Điền,Huyện Mỹ Lộc,Tỉnh Nam Định");
		Pharmacy p8 = new Pharmacy("SGPMC095", "670 Nguyễn Thị Định", "0379342981",
				"670 Nguyễn Thị Định,Phường Thạnh Mỹ Lợi,Huyện Mỹ Lộc,Tỉnh Nam Định");
		Pharmacy p9 = new Pharmacy("SGPMC118", "83 Nguyễn Duy Trinh", "0927042108",
				"83 Nguyễn Duy Trinh,Phường Bình Trưng Tây,Huyện Mỹ Lộc,Tỉnh Nam Định");
		Pharmacy p10 = new Pharmacy("SGPMC153", "403 Nguyễn Duy Trinh", "0379342981",
				"403 Nguyễn Duy Trinh,Phường Bình Trưng Đông,Huyện Mỹ Lộc,Tỉnh Nam Định");
		Pharmacy p11 = new Pharmacy("LVS", "Lê Văn Sỹ", "0379342981",
				"372 Lê Văn Sỹ,Phường 14,Huyện Vụ Bản,Tỉnh Nam Định");
		Pharmacy p12 = new Pharmacy("PAS", "Pasteur", "0927042108",
				"188 Pasteur,Phường 06,Huyện Vụ Bản,Tỉnh Nam Định");
		Pharmacy p13 = new Pharmacy("SGPMC038", "Nguyễn Đình Chiểu", "0379342981",
				" 410 Nguyễn Đình Chiểu,Huyện Vụ Bản,Tỉnh Nam Định");
		Pharmacy p14 = new Pharmacy("SGPMC037", "Nguyễn Thiện Thuật", "0927042108",
				" 249 Nguyễn Thiện Thuật,Huyện Vụ Bản,Tỉnh Nam Định");
		Pharmacy p15 = new Pharmacy("SGPMC055", "230/17 Bis Nguyen Thien Thuat", "0379342981",
				" 213/17 Bis Nguyễn Thiện Thuật,Huyện Vụ Bản,Tỉnh Nam Định");
		Pharmacy p16 = new Pharmacy("NHC", "Nguyễn Hữu Cầu", "0927042108",
				"77 Nguyễn Hữu Cầu,Phường Tân Định,Huyện Ý Yên,Tỉnh Nam Định");
		Pharmacy p17 = new Pharmacy("PHT", "Phạm Hồng Thái", "0927042108",
				"102 Phạm Hồng Thái,Phường Bến Thành,Huyện Ý Yên,Tỉnh Nam Định");
		Pharmacy p18 = new Pharmacy("TCV", "Trần Cao Vân", "0927042108",
				"136 Hai Bà Trưng,Phường Đa Kao,Huyện Ý Yên,Tỉnh Nam Định");
		Pharmacy p19 = new Pharmacy("SGPMC035", "Phạm Ngũ Lão", "0927042108",
				"173 Phạm Ngũ Lão, Phường Phạm Ngũ Lão,Huyện Ý Yên,Tỉnh Nam Định");
		Pharmacy p20 = new Pharmacy("SGPMC046", "Hải Triều", "0927042108",
				"19 Hải Triều ,Phường Bến Nghé,Huyện Ý Yên,Tỉnh Nam Định");
		Pharmacy p21 = new Pharmacy("TDN", "Thảo Điền", "0379342981",
				"Số 10 Thảo Điền,Phường Thảo Điền,Huyện Nghĩa Hưng,Tỉnh Nam Định");
		Pharmacy p22 = new Pharmacy("SGPMC077", "02 Trúc Đường", "0927042108",
				"02 Trúc Đường,Phường Thảo Điền,Huyện Nghĩa Hưng,Tỉnh Nam Định");
		Pharmacy p23 = new Pharmacy("SGPMC095", "670 Nguyễn Thị Định", "0379342981",
				"670 Nguyễn Thị Định,Phường Thạnh Mỹ Lợi,Huyện Nghĩa Hưng,Tỉnh Nam Định");
		Pharmacy p24 = new Pharmacy("SGPMC118", "83 Nguyễn Duy Trinh", "0927042108",
				"83 Nguyễn Duy Trinh,Phường Bình Trưng Tây,Huyện Nghĩa Hưng,Tỉnh Nam Định");
		Pharmacy p25 = new Pharmacy("SGPMC153", "403 Nguyễn Duy Trinh", "0379342981",
				"403 Nguyễn Duy Trinh,Phường Bình Trưng Đông,Huyện Nghĩa Hưng,Tỉnh Nam Định");
		set_tpNamDinh.add(p1);
		set_tpNamDinh.add(p2);
		set_tpNamDinh.add(p3);
		set_tpNamDinh.add(p4);
		set_tpNamDinh.add(p5);

		set_hMyLoc.add(p6);
		set_hMyLoc.add(p7);
		set_hMyLoc.add(p8);
		set_hMyLoc.add(p9);
		set_hMyLoc.add(p10);

		set_hVuBan.add(p11);
		set_hVuBan.add(p12);
		set_hVuBan.add(p13);
		set_hVuBan.add(p14);
		set_hVuBan.add(p15);

		set_hYYen.add(p16);
		set_hYYen.add(p17);
		set_hYYen.add(p18);
		set_hYYen.add(p19);
		set_hYYen.add(p20);

		set_hNghiaHung.add(p21);
		set_hNghiaHung.add(p22);
		set_hNghiaHung.add(p23);
		set_hNghiaHung.add(p24);
		set_hNghiaHung.add(p25);

		list_Pharmacies.put("TP.Nam Định,Nam Định", set_tpNamDinh);
		list_Pharmacies.put("Huyện Mỹ Lộc,Nam Định", set_hMyLoc);
		list_Pharmacies.put("Huyện Vụ Bản,Nam Định", set_hVuBan);
		list_Pharmacies.put("Huyện Ý Yên,Nam Định", set_hYYen);
		list_Pharmacies.put("Huyện Nghĩa Hưng,Nam Định", set_hNghiaHung);

	}

	public ListPharmacy(HashMap<String, Set<Pharmacy>> list_Pharmacies) {
		super();
		this.list_Pharmacies = list_Pharmacies;
	}

	public HashMap<String, Set<Pharmacy>> getList_Pharmacies() {
		return list_Pharmacies;
	}

	public void setList_Pharmacies(HashMap<String, Set<Pharmacy>> list_Pharmacies) {
		this.list_Pharmacies = list_Pharmacies;
	}

	// thêm nhà thuốc vào value của key
	public void addPharmacy(String nameCityAndDistrict, Pharmacy p) {

		if (list_Pharmacies.containsKey(nameCityAndDistrict)) {

			HashSet<Pharmacy> list = (HashSet<Pharmacy>) list_Pharmacies.get(nameCityAndDistrict);
			list.add(p);
		}
	}

	// xóa nhà thuốc khỏi value của key
	public void deletePharmacy(String nameCityAndDistrict, Pharmacy p) {

		if (list_Pharmacies.containsKey(nameCityAndDistrict)) {

			HashSet<Pharmacy> list = (HashSet<Pharmacy>) list_Pharmacies.get(nameCityAndDistrict);
			list.remove(p);
		}

	}

	// tìm kiếm danh sách các nhà thuốc theo key
	public HashSet<Pharmacy> search_ListPharmacies_ByName(String nameCityAndDistrict) {

		return (HashSet<Pharmacy>) list_Pharmacies.get(nameCityAndDistrict);
	}

}
