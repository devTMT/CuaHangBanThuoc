package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import model.Pharmacy;
import model.ListPharmacy;

public class Test_ListPharmacy_1 {

	

	public static void main(String[] args) {

		HashSet<Pharmacy> set_0 = new HashSet<>();
		HashSet<Pharmacy> set_1 = new HashSet<>();
		HashSet<Pharmacy> set_2 = new HashSet<>();
		HashSet<Pharmacy> set_3 = new HashSet<>();
		HashSet<Pharmacy> set_4 = new HashSet<>();
		HashSet<Pharmacy> set_5 = new HashSet<>();
		HashMap<String, Set<Pharmacy>> listPharmacies = new HashMap<>();
		ListPharmacy list = new ListPharmacy(listPharmacies);

		Pharmacy p0 = new Pharmacy("abc4", "ABC4", "123456_4", "NLU4");
		Pharmacy p1 = new Pharmacy("abc1", "ABC1", "123456_1", "NLU1");
		Pharmacy p2 = new Pharmacy("abc2", "ABC2", "123456_2", "NLU2");
		Pharmacy p3 = new Pharmacy("abc3", "ABC3", "123456_3", "NLU3");
		Pharmacy p4 = new Pharmacy("abc4", "ABC4", "123456_4", "NLU4");
		Pharmacy p5 = new Pharmacy("abc5", "ABC5", "123456_5", "NLU5");
		Pharmacy p6 = new Pharmacy("abc6", "ABC6", "123456_6", "NLU6");
		Pharmacy p7 = new Pharmacy("abc7", "ABC7", "123456_7", "NLU7");
		Pharmacy p8 = new Pharmacy("abc8", "ABC8", "123456_8", "NLU8");
		Pharmacy p9 = new Pharmacy("abc9", "ABC9", "123456_9", "NLU9");
		Pharmacy p10 = new Pharmacy("abc10", "ABC10", "123456_10", "NLU10");
		Pharmacy p11 = new Pharmacy("abc11", "ABC11", "123456_11", "NLU11");
		Pharmacy p12 = new Pharmacy("abc12", "ABC12", "123456_12", "NLU12");
		Pharmacy p13 = new Pharmacy("abc13", "ABC13", "123456_13", "NLU13");
		Pharmacy p14 = new Pharmacy("abc14", "ABC14", "123456_14", "NLU14");
		Pharmacy p15 = new Pharmacy("abc15", "ABC15", "123456_15", "NLU15");
		Pharmacy p16 = new Pharmacy("abc16", "ABC16", "123456_16", "NLU16");
		Pharmacy p17 = new Pharmacy("abc17", "ABC17", "123456_17", "NLU17");
		Pharmacy p18 = new Pharmacy("abc18", "ABC18", "123456_18", "NLU18");
		Pharmacy p19 = new Pharmacy("abc19", "ABC19", "123456_19", "NLU19");
		Pharmacy p20 = new Pharmacy("abc20", "ABC20", "123456_20", "NLU20");
		Pharmacy p21 = new Pharmacy("abc21", "ABC21", "123456_21", "NLU21");
		Pharmacy p22 = new Pharmacy("abc22", "ABC22", "123456_22", "NLU22");
		Pharmacy p23 = new Pharmacy("abc23", "ABC23", "123456_23", "NLU23");
		Pharmacy p24 = new Pharmacy("abc24", "ABC24", "123456_24", "NLU24");
		Pharmacy p25 = new Pharmacy("abc25", "ABC25", "123456_25", "NLU25");

		set_0.add(p4);
		set_0.add(p3);
		set_0.add(p2);
		set_0.add(p1);
		set_0.add(p0);

		set_1.add(p9);
		set_1.add(p8);
		set_1.add(p7);
		set_1.add(p6);
		set_1.add(p5);

		set_2.add(p14);
		set_2.add(p13);
		set_2.add(p12);
		set_2.add(p11);
		set_2.add(p10);

		listPharmacies.put("TP HCM,Bình Tân", set_0);
		listPharmacies.put("TP HCM,Q.9", set_1);
		listPharmacies.put("TP HCM,Thủ Đức", set_2);

		System.out.println(set_0);
		System.out.println(set_1);
		System.out.println(set_2);
		System.out.println("------------------------------");

		for (String s : list.getList_Pharmacies().keySet()) {

			System.out.println(s + " \n " + list.search_ListPharmacies_ByName(s));
		}

		System.out.println("------------------------------");

		System.out.println(list.search_ListPharmacies_ByName("tranminhtuyen"));

	}

}
