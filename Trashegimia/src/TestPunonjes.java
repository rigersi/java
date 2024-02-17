
public class TestPunonjes {

	public static void main(String[] args) {
		Punonjes boti = new Punonjes();
		boti.setEmri("boti bot bot");
		boti.setAdresa("Kodra e diellit");
		boti.setTelefoni("355688888888");
		boti.setEmail("boti@gmail.com");
		boti.setZyra("Lab 4");
		boti.setPaga(90000.0);
		boti.setDataPunesimit(new Data(12,1,2017));
		boti.rishikoPaga();
		System.out.println(boti);

	}

}
