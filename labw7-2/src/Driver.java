import java.util.List;

/**
 * @author isaiahbeaudry
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean bol = true;
		byte by = 127;
		int in = 200;
		long lon = 2000_3872-3542L;
		char charVal = 23;
		char negCharVal = (char) -12; // error without cast 
		float flo = 125.45f;
		double dub = 123.4;	
		
		System.out.println("Integer");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println("\nByte");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
		System.out.println("\nShort");
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.SIZE);
		System.out.println("\nLong");
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);
		System.out.println("\nFloat");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.SIZE);
		System.out.println("\nDouble");
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.SIZE);
		System.out.println("\nBoolean");
		System.out.println(Boolean.TYPE);
		
		//byte example = 128; // doesn't let you exceed 128
		
		int example2 = 200;
		byte ex = (byte)example2;
		System.out.println("\nByte cast to an int: " + ex);
		
		//int bolex = (int)bol; // doesn't let you cast	
	}	
	
	public static int sumMulThree1(List<Integer> li) {
		int sum = 0;
		for (int i = 0; i < li.size(); i++) {
			if (Integer.valueOf(li.get(i)) % 3 == 0) {
				sum += li.get(i);
			}
		}
		return sum;
	}
	
	public static int sumMulThree2(List<Integer> li) {
		int sum = 0;
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i) % 3 == 0) {
				sum += li.get(i);
			}
		}
		return sum;
	}
}