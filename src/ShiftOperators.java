
public class ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// << , >> , >>>
		 int n= -5; // 1101
		 System.out.println(n>>2);
		 System.out.println(n>>>2); //00101 // >>> changes the MSB parity to 0
		 
		 System.out.println(n<<2); //5*2^2->20

	}

}
