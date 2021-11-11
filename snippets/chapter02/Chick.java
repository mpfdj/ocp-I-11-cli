public class Chick {
	private String name = "Fluffy";
	{ 
		name = "Miel";
		System.out.println("setting field"); 
	}
	public Chick() {
		//name = "Tinny";
		System.out.println("setting constructor");
	}
	
	public static void main(String[] args){
		Chick chick = new Chick();
		System.out.println(chick.name);
	}
}