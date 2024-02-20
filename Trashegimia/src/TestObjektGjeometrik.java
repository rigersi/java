
public class TestObjektGjeometrik {

	public static void main(String[] args) {
		// sorry meqe klasa eshte abstrakte nuk mund te krijojme nje objekt konkret
		// nga superklasa
		ObjektGjeometrik o = new Trekendesh("kuqe", true, 3,4,5);
		o.setNgjyra("verdh");
		System.out.println(o);
		
		
	}

} 
 