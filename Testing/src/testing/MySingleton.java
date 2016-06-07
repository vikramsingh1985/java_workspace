package testing;

public class MySingleton {
	private static  MySingleton mInstance = null;
	public int x;
	private MySingleton(){
		
	}
	
	public static MySingleton getInstance(){
		if(mInstance == null)
			mInstance =  new MySingleton();
		
		return mInstance;
	}

}
