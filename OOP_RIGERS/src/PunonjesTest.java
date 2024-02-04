
public class PunonjesTest {

	public static void main(String[] args) {
		Punonjes p1 = new Punonjes();
		p1.setEmri("Agim");
		p1.setMbiermi("Bardhi");
		p1.setPagaMujore(60000);
		System.out.println("Paga vjetore eshte "+ p1.getPagaMujore()*12);
		
		Punonjes p2 = new Punonjes("Denis", "Hoxha", 95000);
		System.out.println("Paga vjetore eshte "+ p2.getPagaMujore()*12);
		
		// rritja e pages mujore per punonjesi p1 prej 10%
		p1.setPagaMujore(p1.getPagaMujore()*1.1);
		System.out.println("Paga vjetore eshte "+ p1.getPagaMujore()*12);
		
		
		// rritja e punonjesi p2 prej 5%
		
		p2.setPagaMujore(p2.getPagaMujore()*1.05);
		System.out.println("Paga vjetore eshte "+ p2.getPagaMujore()*12);
		
		
		//int t[] = new int[5];
		
		Punonjes lista[] = new Punonjes[5];
		lista[0] = p1;
		lista[1] = p2;
		lista[2] = new Punonjes("Sotir","Pritfi", 10000);
		lista[3] = new Punonjes("Sonila", "Veshi", 20000);
		lista[4] = new Punonjes("Linda", "Prifti", 90000);
		
		// krijojme nje raport me listen e punonjesve
		// Emer Mbiemer Paga Vjetore
		System.out.println("**********Lista e punonjesve**********");
		System.out.println("Emri     "+"Mbiemri     "+"PagaVjetore");
		for(int i=0; i < lista.length;i++) {
			System.out.printf
					("%-9s%-13s%11.2f\n",
					lista[i].getEmri(),
					lista[i].getMbiermi(),
					lista[i].getPagaMujore()*12
					);
			
		}
		
		

}
	}
