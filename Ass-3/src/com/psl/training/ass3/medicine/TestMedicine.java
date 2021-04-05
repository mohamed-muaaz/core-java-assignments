package com.psl.training.ass3.medicine;

import java.util.*;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine[] medicines = new Medicine[10];
		Random random = new Random();
		for (int i=0; i<10; i++) {
			int rn = random.nextInt(3);
			if (rn == 0) {
				Medicine m = new Tablet();
				m.setCompanyName("Tab"+i);
				m.setAddress("Addrs"+i);
				medicines[i] = m;
			}
			else if (rn == 1) {
				Medicine m = new Syrup();
				m.setCompanyName("Syr"+i);
				m.setAddress("Addrs"+i);
				medicines[i] = m;
			}
			else {
				Medicine m = new Oinment();
				m.setCompanyName("Oin"+i);
				m.setAddress("Addrs"+i);
				medicines[i] = m;
			}
		}
		
		for(Medicine med:medicines) {
			med.displayLabel();
			System.out.println();
		}
	}
}
