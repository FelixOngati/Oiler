import java.math.BigInteger;


public class SummationOfPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger x = new BigInteger("0");
		String string = null;
		for(long i=2L; i<2000000; i++){
			boolean isPrimeNumber = true;
			//check to see if the number is prime
			for(long j=2L; j<(i/2 + 1); j++){
				if(i % j == 0L){
					isPrimeNumber = false;
					break;//exit the inner for loop					
				}
			}
			//print the number if prime
			if(isPrimeNumber){				
				x = x .add(new BigInteger(i + ""));
				string = x.toString();
				//x += i;
				//System.out.print(i + " ");
			}			
		}
		System.out.println();
		System.out.println(string);

	}

}
