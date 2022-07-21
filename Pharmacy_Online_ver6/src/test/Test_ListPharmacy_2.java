package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import model.ListPharmacy;
import model.Pharmacy;

public class Test_ListPharmacy_2 {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("------------------------------");

		for (String s : ListPharmacy.l_P.getList_Pharmacies().keySet()) {

			System.out.println(s + " \n " + ListPharmacy.l_P.search_ListPharmacies_ByName(s));
		}
		
		
	}

}
