
public class TestStudent {

	public static void main(String[] args) {
		Student filani = new Student("Filan Fisteku", "Tirana e Re", "0693333333",
				"filanfisteku@gmail.com", Status.VITIPAR);
		filani.setStatus(Status.BACHELOR);
		if(filani.getStatus()== Status.BACHELOR) {
			System.out.println("Filani eshte ne bachelor");
			}
		System.out.println(filani);
	}

}
