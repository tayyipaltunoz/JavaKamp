package oppIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenova V4", 5000, "12gb",10);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Asus");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setName("yiyecek");
		System.out.println(category1.getName());
		
				
	}

}
