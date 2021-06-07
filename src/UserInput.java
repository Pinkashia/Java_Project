import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//classname obj=new classname();
		Scanner sc=new Scanner(System.in);
	
		int n= sc.nextInt();
		String s=sc.next();
		char c= 'x';
		
		System.out.println("number is: "+ n);
		System.out.println("String is: "+ s);
		System.out.printf(" %d ", (int)c);

	}

}
