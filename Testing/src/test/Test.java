package test;


 class Test {
	private int age;
	private String name;
	
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public static void main(String[] args) {		
		Test hello = new Test();
		hello.setName("vikrant Khushbu!");
		
		System.out.println("User name :  "+hello.getName());
	}
}
