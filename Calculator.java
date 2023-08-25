package week1.day2;

public class Calculator {
	
	private int add(int num1, int num2) {
	return num1+num2;
	}
	public float mul(float num1, float num2) {
	return num1*num2;
	}
	
	public int sub() {
	return(6-4);
	}
	
public static void main(String[] args) {
	Calculator ca =new Calculator();
	System.out.println(ca.add(6,4));
	System.out.println(ca.mul(6,4));
	System.out.println(ca.sub());
	
	}

}

