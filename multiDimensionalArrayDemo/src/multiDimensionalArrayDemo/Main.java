package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		
		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "?stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Sakarya";
		sehirler[1][0] = "Tokat";
		sehirler[1][1] = "Samsun";
		sehirler[1][2] = "Bart?n";
		sehirler[2][0] = "Ankara";
		sehirler[2][1] = "Sivas";
		sehirler[2][2] = "Amasya";

		for (int i = 0; i <= 2; i++) {
			System.out.println("-----------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
