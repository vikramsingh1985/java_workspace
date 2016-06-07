package testing;

public class SingletonTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton a1 = MySingleton.getInstance();
		MySingleton b2 = MySingleton.getInstance();
		a1.x =50;
		b2.x = 90;		
		
		System.out.println("value of object a1 : "+ a1.x);
		System.out.println("value of object b2: "+b2.x);	

	}
	
	
}
