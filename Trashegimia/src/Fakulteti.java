enum Grada{LEKTOR, ASISTENT_PROFESOR, PROFESOR_ASOCIUAR, DOKTOR, PROFESOR};
public class Fakulteti extends Punonjes {
private int oreQendrimiZyre;
private Grada grada;


public Fakulteti(String emri, String adresa, String telefoni, String email,
		String zyra, double paga, Data dataPunesimit, int oreQendrimiZyre, Grada grada) {
	super(emri, adresa, telefoni, email, zyra, paga, dataPunesimit);
	setOreQendrimiZyre(oreQendrimiZyre);
	this.grada = grada;
}

/**
 * @return the oreQendrimiZyre
 */
public int getOreQendrimiZyre() {
	return oreQendrimiZyre;
}

/**
 * @param oreQendrimiZyre the oreQendrimiZyre to set
 */
public void setOreQendrimiZyre(int oreQendrimiZyre) {
	if(oreQendrimiZyre>=0) this.oreQendrimiZyre = oreQendrimiZyre;
}

/**
 * @return the grada
 */
public Grada getGrada() {
	return grada;
}

/**
 * @param grada the grada to set
 */
public void setGrada(Grada grada) {
	this.grada = grada;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString() + String.format("Grada %s\nOret ne zyre %d\n", grada.name(), oreQendrimiZyre);
}

/**
 * rishkruan metoden e superklases
 * Per gradat Profesor, Doktor, Profesor_Asociuar, pavaresisht vitete te punes, aplikohet shteas prej 15%.
 * Per gradat e tjera aplikohet shtese prej 10% vetem ne varesi te viteve te punes
 * @return true ose false kur nuk plotesohet kriteri i viteve te punes
 */
@Override
public boolean rishikoPaga() {
	// TODO Auto-generated method stub
	switch (grada) {
	case	PROFESOR,
			DOKTOR,
			PROFESOR_ASOCIUAR :
				this.setPaga(paga*1.15);
	return true;
	
	default:
		return super.rishikoPaga();
	
	
	}

}


}
