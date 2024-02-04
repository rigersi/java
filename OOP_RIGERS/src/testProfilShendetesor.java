
public class testProfilShendetesor {

	public static void main(String[] args) {
		ProfilShendetesor p1 = new ProfilShendetesor();
		p1.setDatalindjes(new Data(1,2,2023));
		p1.getDatalindjes().afishoDaten();
		System.out.println(p1.getMosha());
		System.out.println(p1.getMosha()+" vjec");

	}

}
