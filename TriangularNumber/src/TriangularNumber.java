
public class TriangularNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		int i=0;		
		while(i<7){
			int j=1;
			++y;
			x = x + y;
			while(j <= x){
				if(x % j == 0)
					i++;
				j++;
			}
		}
		System.out.print(x);

	}

}
