package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
		mesajVer();
	
	}
	public static void sayiBulmaca() {
		int[] sayilar = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int aranacak = 11;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		if (varMi) {
			System.out.println("Sayi mevcuttur");
		} else {
			System.out.println("Sayi mevcut de�ildir");

		}

	}
	public static void mesajVer() {
		System.out.println("sa") ;
	}
}
