package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 --> 1,2,3 tam b�l�nebildi�i say�lar�n toplam� kendisine e�ittir.

		int number = 5;
		int toplam =0;

		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				toplam = toplam + i;
			}
		}
		if (number == toplam) {
			System.out.println("Sayi m�kemmel say�d�r");
		}else {
			System.out.println("Say� m�kemmel say� de�ildir");
		}

	}

}
