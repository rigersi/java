
public class TestTrekendesh {

	public static void main(String[] args) {
		Trekendesh t1 = new Trekendesh();
		t1.setNgjyra("jeshile");
		t1.setNgjyrosur(true);
		
		System.out.println(t1);
		System.out.println("------------");
		Trekendesh t2 = new Trekendesh("kuqe", true, 3,4,5);
		System.out.println(t2);
		System.out.println("Perimetri i t2= " + t2.getPerimeter());
		System.out.println("Siperfaqja e t2= " + t2.getSiperfaqe());
	}

} 
