package interfaceAbstractDemo;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1, "Engin", "Demiroğ","1985,1,6", "28861499108"));
	}

}
