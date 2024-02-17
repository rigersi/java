/**
 * Klasa Drejtkendesh zgjeron klasen ObjektGjeometrik, pasi nje Drejtkendesh eshte nje Objekt gjeometrik.
 * Drejtkendeshi ka dy fusha brinja1 dhe brinja2.
 * Perimetri = 2*(brinja1 + brinja2)
 * Siperfaqe = brinja1 * brinja2.
 * @author Rigers
 */
public class Drejtkendesh extends ObjektGjeometrik{
	private double brinja1 =1.0 , brinja2 = 2.0;
	public Drejtkendesh() {
		
	}
	public Drejtkendesh(String ngjyra, boolean ngjyrosur, double brinja1, double brinja2) {
		super(ngjyra, ngjyrosur);
		this.brinja1 = brinja1;
		this.brinja2 = brinja2;
		
	}
	/**
	 * @return the brinja1
	 */
	public double getBrinja1() {
		return brinja1;
	}
	/**
	 * @param brinja1 the brinja1 to set
	 */
	public void setBrinja1(double brinja1) {
		this.brinja1 = brinja1;
	}
	/**
	 * @return the brinja2
	 */
	public double getBrinja2() {
		return brinja2;
	}
	/**
	 * @param brinja2 the brinja2 to set
	 */
	public void setBrinja2(double brinja2) {
		this.brinja2 = brinja2;
	}
	public double getSiperfaqja() {
		return brinja1 * brinja2;
	}
	public double getPerimetri() {
		return 2*(brinja1 + brinja2);
	}
}
