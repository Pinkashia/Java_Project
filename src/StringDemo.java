
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "abcd";
		//['a' 'b','c','d' ]
		System.out.println(s1);
		
		
		StringBuffer sb= new StringBuffer("xyz"); //new StringBuffer()   //new StringBuffer(17)
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		//s1= sb.append(s1);  // not allowed because Strings are IMMutable
		sb= sb.append(s1);  // allowed because String Buffer objects  are Mutable
		
		StringBuffer sb2= new StringBuffer("xyz"); //3bytes
		StringBuffer sb3= new StringBuffer("xyz");
		
		System.out.println(sb2==sb3);
		System.out.println(sb2.equals(sb3));
		
		StringBuilder s_b = new StringBuilder("ssdc");
		

	}

}

