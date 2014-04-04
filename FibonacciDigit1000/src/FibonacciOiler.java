import java.math.BigInteger;

public class FibonacciOiler {
	
	BigInteger t1 = new BigInteger("1");
	BigInteger t2 = new BigInteger("1");
	BigInteger display = new BigInteger("1");
	int def = 1;
	int x = 0;
	int y = 2;
	String string;
	public int fibonacciCalcultor(int limit){		
		while(x < limit){
			    y++;
				display = t1.add(t2);
				t1 = t2;
				t2 = display;
				BigInteger result = new BigInteger(display + "");
				string = result.toString();
				x = string.length();				
			}
		System.out.printf("%s\n", string);
		return y;
	}		
	
	
	

}
