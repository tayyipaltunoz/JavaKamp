package conditionals;

public class Main {

	public static void main(String[] args) {
		//switch
		char grade = 'D';
		
		switch (grade) {
		case 'A' :
			System.out.println("M�kemmel ge�tiniz");
		break;
		case 'B' :
			System.out.println("�ok g�zel ge�tiniz");
		break;
		case 'C' :
			System.out.println("�yi ge�tiniz");
		break;
		case 'D' :
			System.out.println("Fena de�il ge�tiniz");
		break;
		case 'F' :
			System.out.println("Maalesef kald�n�z");
		break;
		default:
			System.out.println("Ge�ersiz not girdiniz");
		
		}
		
		//if
		int sayi = 22;
		
		if (sayi < 20) {
			System.out.println("sayi 20'den k���kt�r");
		} 
		else if (sayi == 20) {
			System.out.println("sayi 20'ye e�ittir");
		} 
		else {
			System.out.println("sayi 20'den k���kt�r");
		}
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		int enbuyuk =sayi1;
		
		if (enbuyuk<sayi2) {
			enbuyuk=sayi2;
		}
		if (enbuyuk<sayi3) {
			enbuyuk=sayi3;
		}
		System.out.println("En b�y�k : " + enbuyuk);
	}

	}