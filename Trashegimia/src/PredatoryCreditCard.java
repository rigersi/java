/**
 * Klasa PredatoryCreditCard zgjeron klasen CreditCard ne dy menyra:
 * 
(1) nëse një kreditim i tentuar refuzohet sepse do të kishte tejkaluar kufirin e
fushës limit, një tarifë prej 5 euro do te shtohet ne balancën e kartës dhe 

(2)
do të ketë një mekanizëm për llogaritjen e tarifës mujore bazuar ne balancën e
kartës, duke përdorur një interes përqindjeje vjetore i specifikuar si një
parametër i ri ne konstruktorin e klasës.
 */
/**
 * Fjala kyce extends krijon nje nenklase te klases CreditCard.
 * Themi qe CreditCard eshte nje superklase a PredatoryCreditCard,
 * dhe PredatoryCreditCard eshte nenklase e CreditCard.
 * 
 * Trashegimia shton nje marredhenie midis klasave qe njihet si eshte-nje 
 * 
 * Kemi qe nje PredatoryCreditCard eshte-nje CreditCard.
 * 
 * Nenklasa trashegon te gjitha variablat e instances dhe metodat e superklases.
 * E vetmja gje qe nuk trashegohet eshte konstruktori i superklases.
 * Nese duam te therrasim konstruktorin e superklases duhet te perdorim fjalen kyce super()
 * Te gjitha variablat privat te superklases mbeten te paaksesueshem tek nenklasa
 * dhe mund te aksesohen vetem nepermjet metodave publike.
 * Nese duam qe nje fushe private te aksesojme brenda nenklases duhet ta ndryshojme ne protected
 */
public class PredatoryCreditCard extends CreditCard{
private double apr; //annual processing rate, perdoret per llogaritjen e tarifes mujore

/**
 * 
 */
public PredatoryCreditCard() {
	super();
	// TODO Auto-generated constructor stub
}
 
/**
 * @param customer
 * @param bank
 * @param account
 * @param limit
 * @param balance
 */
public PredatoryCreditCard(String customer, String bank, 
		String account, int limit, double balance, double apr) {
	
	super(customer, bank, account, limit, balance);
	this.apr = apr;
}

/**
 * @return the apr
 */
public double getApr() {
	return apr;
}

/**
 * @param apr the apr to set
 */
public void setApr(double apr) {
	this.apr = apr;
}
@Override
public boolean charge(double amount) {
	if(!super.charge(amount)) {
		this.setBalance(this.getBalance()+5);
		return false;
	} 
	return true;
}
/**
 * Metode e re specifike per te klase e cila nje here ne muaj aplikon nje interes
 * mujor ne baze te detyrimit qe ka klienti.
 * 
 */
public void processMonthly() {
	double interes = Math.pow(1 + apr, 1/12.0)*getBalance();
	setBalance(interes + this.getBalance());
}

}
