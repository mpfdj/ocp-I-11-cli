public class DefaultValues {
	
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static boolean bool;
	
	
	public static void main(String[] args) {
		System.out.println("byte: " + b);   // 0
		System.out.println("short: " + s);  // 0
		System.out.println("int: " + i);    // 0
		System.out.println("long: " + l);   // 0
		System.out.println("float: " + f);  // 0.0
		System.out.println("double: " + d); // 0.0
		System.out.println("boolean: " + bool); // false
		
		// f = 1.0;  // does not compile double can't be assigned to float
		
		
		f = 1.0f;
		System.out.println("float: " + f);
		
		f = 1L;
		System.out.println("float: " + f);

	}
}