
public class PunonjesTest1 {

	public static void main(String[] args) {
		Punonjes p1 = new Punonjes();
		p1.setEmri("Agim");
		p1.setMbiermi("Bardhi");
		p1.setPagaMujore(60000);
		Punonjes p2 = new Punonjes("Denis", "Hoxha", 95000);
		Punonjes lista[] = new Punonjes[5];
		lista[0] = p1;
		lista[1] = p2;
		lista[2] = new Punonjes("Sotir","Pritfi", 10000);
		lista[3] = new Punonjes("Sonila", "Veshi", 20000);
		lista[4] = new Punonjes("Linda", "Prifti", 90000);
		lista[1].setPaga13(true);
		lista[4].setPaga13(true);
		System.out.println("**********Lista e punonjesve**********");
		System.out.println("Numri total i punonjesve = "+Punonjes.getNrPunonjes());
		System.out.println("Emri     "+"Mbiemri     "+"PagaVjetore");
		
		// menyra for each e bredhjes se nje tabele
		for(Punonjes p:lista)
			Punonjes.afishoPunonjes(p);
		
		//for(int i=0;i<lista.length;i++)
			//Punonjes.afishoPunonjes(lista[i]);

	}

}
