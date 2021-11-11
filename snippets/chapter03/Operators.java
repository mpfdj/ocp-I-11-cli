public class Operators {
	
	public static void main(String[] args) {
		int i = 0;
		i++;
		
		System.out.println(i);
		
		System.out.println(10/2);  // division (5)
		System.out.println(10%2);  // modulo rest na deling (0)
		

/*
		--, ++
		*, /, %
		+, -, !
*/
		
		// int j = 192301398193810323;  // will not compile integer number is too large
		// long l = 192301398193810323; // will not compile integer number is too large
		long l = 192301398193810323L;
		
		float f = 1.9999f;
		int k = (int)f;
		System.out.println(k);  // using floor here value is 1
		
		
		
		int i2 = (int)1.999;
		System.out.println(i2);
		
		
	}
	
}