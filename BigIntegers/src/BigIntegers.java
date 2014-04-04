/*this program finds distinct
 *  terms are in the sequence generated by a^b 
 *  for 2 ≤ a ≤ 100 and 2 ≤ b ≤ 100?*/
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
//import java.math.*;
public class BigIntegers {
	
	public static void main(String[] args) {	
		BigInteger r;
		BigInteger t = new BigInteger("0");
		ArrayList powers = new ArrayList();
		
		for(int x = 2; x <= 100; x++){
			r = new BigInteger(x + "");
			for(int y = 2; y <= 100; y++){
				t = r.pow(y);
				powers.add(t);
			}
		}	
		//Converting ArrayList to HashSet to remove duplicates
		HashSet<String> listToSet = new HashSet<String>(powers);
		//creating an ArrayList without duplicate values
		ArrayList<String> listWithoutDuplicates = new ArrayList<>(listToSet);
		/*for(int m = 0; m < powers.size(); m++){
			for(int n = 0; n < powers.size(); n ++){
				if( m == n)
					break;
				if(powers.get(m) == powers.get(n))
					powers.remove(n);
			}
		}*/
		//System.out.println(listWithoutDuplicates);
		System.out.println(listWithoutDuplicates.size());
	}//end main

}//end class BigIntegers
