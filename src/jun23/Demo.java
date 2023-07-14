package jun23;

public class Demo {
	
	public static void add(int x, int y) {
		
		int z = x+y;
		System.out.println(z);
	}
	
	public static String verify_String(String str1,String str2) {
		
		String res="";
		if(str1.equalsIgnoreCase(str2)) {
			res="Strings are Equal";
		}
		else {
			res ="Strings are not Equal";
		}
		return res;
	}
	
	public static boolean compare_Values(int a, int b) {
		
		if(a==b) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void division(double x,double y) {
		
		double z = x/y;
		System.out.println(z);
	}
	
	public static void main(String args[]) {
		
		Demo.add(12345, 3456778);
		String res = Demo.verify_String("India", "India");
		System.out.println(res);
		boolean x = Demo.compare_Values(100, 300);
		System.out.println(x);
		Demo obj = new Demo();
		obj.division(34543543, 67);
		
	}

}
