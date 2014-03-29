import java.math.BigInteger;
import java.util.Scanner;


public class FactolrialClass {
	Scanner input = new Scanner(System.in);
	//System.out.println("Enter a number: ");
	//int limit = input.nextInt();
	//private String fact = factorial(limit);
	
	public static String factorial(int n) {
	       BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	   }
}
