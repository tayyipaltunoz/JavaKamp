package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String internetButon = "�ubeye Gir";
		System.out.println(internetButon);
		int vade = 7;
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		boolean dustuMu = false;

		System.out.println(dolarDun);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t� Resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar y�kseldi resmi");

		} else {
			System.out.println("Dolar e�ittir");
		}
		String[] krediler = { "H�zl� Krediler", "Mutlu Emekli Kredisi", "Konut Kredisi", "�ift�i Kredisi",
				"Msb Kredisi", "Meb Kredisi" };
		 for(String kredi:krediler) {
			System.out.println(kredi); 
		 }
		 for(int i =0;i<krediler.length;i++) {
			 System.out.println(krediler[i]);
		 }
		 System.out.println("yeniden merhaba");
		 
		 ////////////////////
		 byte sayi;
		 sayi =127;
		 
		 char karekter='e';
	}

}
