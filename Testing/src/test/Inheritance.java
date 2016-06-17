package test;

public class Inheritance {
	public static void main(String[] args) {
		/*PapaInterface1 p1 = new BachhaImpl();
		PapaInterface2 p2 = new BachhaImpl();
		
		p1.test();
		p1.display();
		p2.test();*/
		
		/*Papa p = new Papa();
		p.test();
		
		Bachha b = new Bachha();
		b.test();*/
		
		Papa pb = new Bachha();
		pb.test();
	
		/*PapaAbs pabs = new BachhaAbs();
		pabs.test();*/
	}
}

abstract class PapaAbs {
	PapaAbs() {
		System.out.println("PapaAbs constructor");
	}
	public void test() {
		System.out.println("test from PapaAbs");
	}
}

class BachhaAbs extends PapaAbs {
	BachhaAbs() {
		System.out.println("BachhaAbs constructor");
	}
	public void test() {
		System.out.println("test from BachhaAbs");
	}
}

interface PapaInterface1 {
	void test();
	void display();
}

interface PapaInterface2 {
	void test();
}

class BachhaImpl implements PapaInterface1, PapaInterface2 {
	@Override
	public void test() {
		System.out.println("BachhaImpl test.");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display BachhaImpl");
	}
}


// public > protected > default > private
class Papa {
	Papa() {
		System.out.println("Papa constructor");
	}
	public void test() {
		System.out.println("test from Papa");
	}
} 

class Bachha extends Papa {
	Bachha() {
		System.out.println("Bachha constructor");
	}
	public void test() {
		System.out.println("test from Bachha");
	}
}
