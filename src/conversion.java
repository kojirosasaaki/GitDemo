
public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "2345";
		String str2 = "987";
		
		//parseInt:it converts string to integer
		
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		
		System.out.println(x+y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(x-y);
		
		//valueOff:it converts integer to string
		
		int a = 7654;
		int b = 765;
		
		String t1 = String.valueOf(a);
		String t2 = String.valueOf(b);
		
		System.out.println(t1.concat(t2));

	}

}
