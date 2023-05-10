package interfaces;

public class CustomerManager {
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	//Loosly -tightly coupled 
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi " + customer.getFirstName());
//		DatabaseLogger logger = new DatabaseLogger(); bağımlılık bu yarın bunun yuerine filelogger isterse
//		logger.log(customer.getFirstName() + " veri tabanına loglandı");
//		for(Logger logger: loggers) {
//			logger.log(customer.getFirstName());
//		} operasyonu utilse yazdık
		
		
//		Utils utils = new Utils();  STATİC yaptıüım için direk sınıfın ismini büyük yazıp kullanabilirim
//		utils.runLoggers(loggers, customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}

	public void delete(Customer customer) {
		System.out.println("Müşteri silindi " + customer.getFirstName());
//		DatabaseLogger logger = new DatabaseLogger(); bağımlılık bu yarın bunun yuerine filelogger isterse
//		logger.log(customer.getFirstName() + " veri tabanına loglandı");

		Utils.runLoggers(loggers, customer.getLastName());

	}
}
