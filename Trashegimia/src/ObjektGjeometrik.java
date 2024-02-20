/**
 * Kur nje klase deklarohet abstrakte, kjo klase nuk mund te inicializohet
 * Per kete arsye tek klasa TestObjektGjeometrik o merrni disa errore/gabime
 * 
 * Klasat abstrakte mund te kene konstruktor qe mund te perdoren nga nenklasat
 * dhe mund te kene metoda konkrete qe mund te perdoren edhe nga nenklasat.
 * 
 * Klasat abstrakte mund te permbajne metoda abstrakte me ane te fjales kyce abstract.
 * 
 * Metodat abstrakte deklarohen pa trupin e metodes dhe duhet te implementohen nga nenklasat.
 * 
 * Nje klase qe permban nje metode abstrakte, duhet deklaruar si abstrakte
 */
import java.util.Date;

public abstract class ObjektGjeometrik extends Object{
private String ngjyra;
private boolean ngjyrosur;
private Date dataKrijimit;

/**
 * Konstruktori default
 * 
 */
public ObjektGjeometrik() {
	System.out.println("Konstruktori pa parametra i klases ObjektGjeometrik");
	this.dataKrijimit = new Date();
}
/**
 * 
 */
public ObjektGjeometrik(String ngjyra, boolean ngjyrosur) {
	this(); //therritet konstruktori default
	System.out.println("Konstruktori me parametra i klases ObjektGjeometrik");
	this.ngjyra = ngjyra;
	this.ngjyrosur = ngjyrosur;
	
	
}
/**
 * @return the ngjyra
 */
public String getNgjyra() {
	return ngjyra;
}
/**
 * @param ngjyra the ngjyra to set
 */
public void setNgjyra(String ngjyra) {
	this.ngjyra = ngjyra;
}
/**
 * @return the ngjyrosur
 */
public boolean isNgjyrosur() {
	return ngjyrosur;
}
/**
 * @param ngjyrosur the ngjyrosur to set
 */ 
public void setNgjyrosur(boolean ngjyrosur) {
	this.ngjyrosur = ngjyrosur;
}
/**
 * @return the dataKrijimit
 */
public Date getDataKrijimit() {
	return dataKrijimit;
}
@Override 
public String toString() {
	return String.format("Krijuar me %s\nNgjyra %s\nNgjyrosur %s",
			getDataKrijimit(), getNgjyra(), isNgjyrosur());
}

// duhet te kete nje implementim konkret tek nenklasat, duhet bere override
public abstract double getSiperfaqe();	

//duhet te kete nje implementim konkret tek nenklasat, duhet bere override
public abstract double getPerimeter();

}
