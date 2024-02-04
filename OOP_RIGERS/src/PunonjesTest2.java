
public class PunonjesTest2 {

	public static void main(String[] args) {
		Punonjes p1 = new Punonjes("Agim","Prifti",50000);
		p1.setDatalindjes(new Data(1,2,2023));
		p1.getDatalindjes().afishoDaten();
		System.out.println(p1.getMosha());
		System.out.println(p1.getMosha()+" vjec");
		
	}
	
}
