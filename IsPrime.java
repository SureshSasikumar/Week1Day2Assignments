package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int number =5;
		
		for (int i=2; i<=number-1; i++) {
			if(number%i == 0)
			{
			System.out.println("not a prime");
			}
			
			
			else {
				System.out.println("prime number");
			}
		}
		
	
	}

}
