/**
 * Klasa Rrethi zgjeron klasen ObjektGjeometrik, pasi nje rreth eshte-nje objekt gjeometrik.
 * Rrethi ka fushen rrezja te tipit double me vlere default 1.0
 * Ka metoda getPerimeter(), getSiperfaqe(), toString()
 * Perimetri = 2 * pi * rrezja
 * Siperfaqja = pi * rrezja * rrezja
 * @author Rigers
 */
public class Rrethi extends ObjektGjeometrik{
private double rrezja;
public Rrethi() {
	
}
public Rrethi(String ngjyra, boolean ngjyrosur, double rrezja) {
	rrezja = 1.0;
}
 
/**
 * @return the rrezja
 */
public double getRrezja() {
	return rrezja;
}
/**
 * @param rrezja the rrezja to set
 */
public void setRrezja(double rrezja) {
	this.rrezja = rrezja;
}
@Override
public double getPerimeter() {
	return 2*Math.PI*rrezja;
}
@Override
public double getSiperfaqe() {
	return Math.PI * rrezja * rrezja;
	
}


}
