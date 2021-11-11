public class ComparingValues {
	public static void main(String[] args) {
		
		// blz 96
		// Comparing object references
		String monday = new String("schedule");
		String tuesday = new String("schedule");
		String wednesday = tuesday;
		System.out.println(monday == tuesday);     // false
		System.out.println(tuesday == wednesday);  // true
		
	}
}