/**
 * enum eshte nje shkurtim i enumerator dhe perdoret per te krijuar nje liste me konstante
 * enum emriEnumeratori {lista e konstante te ndara me presje}
 */
enum Status {VITIPAR, VITIDYTE, BACHELOR, MASTER};

public class Student extends Person{
private	Status status;

public Student(String emri, String adresa, String telefoni, String email, Status status) {
	super(emri, adresa, telefoni, email);
	this.status = status;
}
/**
 * @return the status
 */
public Status getStatus() {
	return status;
}

/**
 * @param status the status to set
 */
public void setStatus(Status status) {
	this.status = status;
}
@Override
public String toString() {
	return  super.toString() + String.format("Statusi %s\n",status.name());
}

}
