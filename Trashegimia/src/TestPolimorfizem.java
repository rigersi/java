/**
 * ObjektGjeometrik r = new Rrethi();
 * 
 * variabli r eshte variabel reference dhe ka si tip te deklaruar ObjektGjeometrik
 * dhe si tip aktual ka klasen Rrethi
 * 
 * Variabli r quhet variabel polimorf
 * 
 * r.toString(); do therritet metoda e tipit aktual qe eshte ajo e klases Rrethi
 * 
 * Operatori instanceOf perdoret ne java per te treguar nese nje objekt i perket nje klase te caktuar
 * 
 * o instanceOf Rrethi kthen vleren true nese o eshte nje objekt konkret i klases Rrethi dhe 
 * false perndryshe.
 * 
 * 
 */
public class TestPolimorfizem {

		public static void main(String[] args) {
			ObjektGjeometrik r = new Rrethi();
			r.setNgjyra("Gri");
			System.out.println(r.toString());
			
			ObjektGjeometrik o; // variabel shumeformesh
			o = new Trekendesh("kuqe", true, 3.0,4.0,5.0);
			System.out.println(o);
			o = new Drejtkendesh("blue", false, 3.5,2.7);
			System.out.println(o);
			
			ObjektGjeometrik[] lista = new ObjektGjeometrik[5];
			lista[0] = new Rrethi("verdh", false, 3.4);
			lista[1] = new Trekendesh("blue", true, 3,4,6);
			lista[2] = o;
			lista[3] = new Katror("white", false, 10);
			lista[4] = new Drejtkendesh();
			printSiperfaqe(lista);
		}
		public static void printSiperfaqe(ObjektGjeometrik[] lista) {

			for(ObjektGjeometrik o:lista) {
				String emri = "";
				if(o instanceof Rrethi) emri = " e rrethit";
				else if(o instanceof Trekendesh) emri = " e trekendeshit";
				else if(o instanceof Katror) emri = " e katrorit";
				else if(o instanceof Drejtkendesh) emri = " e drejtkendeshit";
				else {
					System.out.println("Objekt gjeometrk i panjohur");
					return;
				}
				System.out.println("Siperfaqja = "+emri+" + "+ o.getSiperfaqe());
				
				
			}
		}
	}
