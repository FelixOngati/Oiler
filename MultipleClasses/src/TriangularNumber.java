
public class TriangularNumber {
	public TriangularNumber(){};
	public static int triangular(int limit){
		int number=0;
		//int x =0;
		int n = 0;
		int factors = 0;
		while(factors<=limit){
			n++;
			number += n;
			factors = factors(number);
		}
		//factors = factors(number);
		System.out.println(factors);
		return number;
	};
	
	public static int factors(int number){
		int count = 0;
		for(int i = 1; i <= number; i++){
			if(number % i == 0)
				count++;
		}
		return count;
	}

}
