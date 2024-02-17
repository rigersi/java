
public class TestCreditCard {

	public static void main(String[] args) {
		CreditCard cr1 = 
			new CreditCard("John Cena", "BKT", "3334 3333 4454 4444", 3000, 0.0);
		cr1.charge(1000.0);
		System.out.println("Balanca e kartes = "+ cr1.getBalance());
		
		cr1.charge(2500);
		System.out.println("Balanca e kartes = "+ cr1.getBalance());

		cr1.makePayment(500);
		System.out.println("Balanca e kartes = "+ cr1.getBalance());

		cr1.charge(2500);
		System.out.println("Balanca e kartes = "+ cr1.getBalance());
		
		PredatoryCreditCard pr1 = new PredatoryCreditCard();
		
 	}
 
}
