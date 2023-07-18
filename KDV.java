package patika;

import java.util.Scanner;

public class KDV {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double para = s.nextInt();
		if (para < 1000) {
			double kdv_tutari = (para / 100) * 18;
			System.out.println("kdv tutarý " + kdv_tutari);
			System.out.println("kdv'siz fiyat " + (para - kdv_tutari));
			System.out.println("kdv'li fiyat " + para);
		}
		if (para >= 1000) {
			double kdv_tutari = (para / 100) * 8;
			System.out.println("kdv tutarý " + kdv_tutari);
			System.out.println("kdv'siz fiyat " + (para - kdv_tutari));
			System.out.println("kdv'li fiyat " + para);
		}
	}

}
