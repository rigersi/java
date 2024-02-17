
public class Person {
protected String emri;
protected String adresa;
protected String telefoni;
protected String email;

public Person() {
	super();//por qe kjo eshte keshtu by default edhe pa shkruar
	
}
public Person(String emri, String adresa, String telefoni, String email) {
	this.emri = emri;
	this.adresa = adresa;
	this.telefoni = telefoni;
	this.email = email;
}
/**
 * @return the emri
 */
public String getEmri() {
	return emri;
}
/**
 * @param emri the emri to set
 */
public void setEmri(String emri) {
	this.emri = emri;
}
/**
 * @return the adresa
 */
public String getAdresa() {
	return adresa;
}
/**
 * @param adresa the adresa to set
 */
public void setAdresa(String adresa) {
	this.adresa = adresa;
}
/**
 * @return the telefoni
 */
public String getTelefoni() {
	return telefoni;
}
/**
 * @param telefoni the telefoni to set
 */
public void setTelefoni(String telefoni) {
	this.telefoni = telefoni;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("Emri %s\nAdresa %s\nTelefoni %s\nEmail %s\n"
			, emri, adresa, telefoni, email
			);
}

}
