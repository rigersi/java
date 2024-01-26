/**
 * Klasa Punonjes modelon nje punonjes te nje kompanie 
 *@author Rigersi
 *@version 1.0
 * @
 */
public class Punonjes {
	private String emri; // Emri i punonjesit
	private String mbiemri; // Mbiemri i punonjesit
	private double pagaMujore; // Paga mujore e punonjesit
	private boolean paga13=false; // paga e 13 e punonjesit
	private static int nrPunonjes=0;
	public Punonjes() {
		nrPunonjes++;
	}
	/**
	 * Nderton nje objekt te klases Punonjes me parametrat e specifikuar me poshte
	 * 
	 * Nese pagaMujore eshte negative, vlera default 0 do te vendoset
	 * 
	 * @param emri Emri i punonjesit
	 * @param mbiemri Mbiemri i punonjesit
	 * @param pagaMujore Paga mujore e punonjesit
	 */
	public Punonjes(String emri, String mbiemri, double pagaMujore) {
		setEmri(emri);
		setMbiemri(mbiemri);
		if(pagaMujore > 0.0) setPagaMujore(pagaMujore);
		nrPunonjes++;
	}
	
	/**
	 * Metoda get per emrin e punonjesit
	 * @return emri i punonjesit
	 */
	public String getEmri() {
		return emri;
	}
	/**
	 * Metoda set per fushen/variablin emri
	 * @param emri Vendos emrin e punonjesit
	 */
	public void setEmri(String emri) {
		this.emri = emri; // this.emri i referohet fushes emri i rreshtit 8 pra, dhe emri i referohet parametrit emri ne rreshtin siper ksaj
	}
	public String getMbiemri() {
		return mbiemri;
	}
	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}
	public double getPagaMujore() {
		return pagaMujore;
	}
	public void setPagaMujore(double pagaMujore) {
		this.pagaMujore = pagaMujore;
	}
	public boolean getPaga13() {
		return paga13;
	}
	public void setPaga13(boolean paga13) {
		this.paga13 = paga13;
	}
	/**
	 * Llogarit pagen vjetore ne baze te pages mujore.
	 * @return 12 pagat + pagen e 13 nese fusha paga13 eshte true
	 */
	public double getPagaVjetore() {
		
		return getPaga13() ? getPagaMujore()*14 : getPagaMujore()*12;
	}
	public static int getNrPunonjes() {
		return nrPunonjes;
	}
	public static void afishoPunonjes(Punonjes punonjes) {
		
		if(punonjes!=null) System.out.printf("%-9s%-13s%2.2f\n", 
				punonjes.getEmri(),  
				punonjes.getMbiemri(),  
				punonjes.getPagaVjetore()
				);
	}
}
