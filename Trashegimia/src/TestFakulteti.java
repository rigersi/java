
public class TestFakulteti {

	public static void main(String[] args) {
		Fakulteti dekani = new Fakulteti("Spirro Dushku", "Tirane", "355685555555","spirro@gmail.com", 
				"Kati pare Godina A", 170000, new Data(1,1,1990), 4, Grada.PROFESOR);
		System.out.println(dekani);
		dekani.rishikoPaga();
		System.out.println(dekani);
	}

}
