package asalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 7;
		boolean asalMi = true;

		if (sayi == 1 ) {
			System.out.println("Sayi de?ildir");
			return;
			
		}
		if (sayi < 1 ) {
				System.out.println("Sayi asal de?ildir");
				return;
		}

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {

				asalMi = false;
			}

		}
		if (asalMi) {
			System.out.println("Sayi asald?r");
		} else {
			System.out.println("Sayi asal de?ildir");

		}

	}
}
