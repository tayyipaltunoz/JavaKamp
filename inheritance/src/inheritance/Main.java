package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer tayyip = new IndividualCustomer();
		tayyip.id = 1;
		tayyip.firstName = "tayyip";
		tayyip.lastName = "altunoz";
		tayyip.nationalIdentity = "10000000000";
		tayyip.customerNumber = "9696";

		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber = "78919";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="3434";

		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {tayyip,abc,hepsiburada};
		
		customerManager.addMultiple(customers);
		
		
	}
}