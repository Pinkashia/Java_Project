
public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int age=15;
		if(age>=18) 
		{
			System.out.println("allow");
		}
		else if(age>=15)
		{
			System.out.println("can be allowed");
		}
		else
		{
			System.out.println("not allowed");
		}
		*/
		for(int count=0; count<=100; count++)
		{
			if(count%5 == 0)
			{
				continue;
			}
			System.out.println(count);
			

			
		}
		System.out.println("End");
		
		//Ternary Operator  String sup =partexp1  ? part2 : (x<22? "tiny":"cc")
		int samp=10;
		String b= (samp <= 5) ? "small" :(samp <22? "tiny":"cc") ;
		System.out.println(b);
		
	}

}
