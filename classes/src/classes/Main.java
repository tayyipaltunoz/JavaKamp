package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value
		int sayi1=10;
		int sayi2=20;
		sayi1 =sayi2;
		sayi2=30;
		System.out.println("değer tip " + sayi1);
		
		//reference
		int sayilar1[]= new int[] {1,2,3,4,5,6};
		int sayilar2[]= {1,2,3,4,5,6};
		sayilar1 =sayilar2;
		sayilar2[2]=30;
		
		System.out.println("referans tip " + sayilar1[2]);
	}

}
