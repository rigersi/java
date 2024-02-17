/**
 * Klasa katror zgjeron klasen Drejtkendesh, pasi nje katror eshte nje rast i vecante i klases 
 * Drejtkendesh ku brinja 1 = brinja 2
 * Kjo klase nuk ka asnje fushe te re
 * Konstruktori default nderton nje katror me brinje default 2.0
 * @author Rigers
 */
public class Katror extends Drejtkendesh{
	public Katror() {
		setBrinja1(2.0);
		setBrinja2(2.0);
	}
	public Katror(String ngjyra, boolean ngjyrosur, double brinja) {
		super(ngjyra, ngjyrosur, brinja, brinja);
		
	}
/*	@Override
	public String toString() {
		ObjektGjeometrik o1 = new ObjektGjeometrik     duhet dicka qe te kapim metoden objekt gjeometrik
		return String.format("Katrori me brinje %.2f\n", this.getBrinja1())+ o1.toString(); }
		*/
	}

