
public class ForDemo {

	public static void main(String[] args) {
		int n=3;
		
		for( int i= 1; i<=3 ; i++ ) //Rows-1
		{
			for(int c=1 ; c<=3; c++)//columns
			{
				System.out.print(n+ "    ");
			}
			
			System.out.println();
			
		}
		
	}

}


/*
1R-3 3 3
2R-3 3 3
3R-3 3 3

1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4 


1
1 2
1 2 3 
1 2 3 4

*/