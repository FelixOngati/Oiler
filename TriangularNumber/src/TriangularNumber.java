
public class TriangularNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0, i=0;
		while(i<7){
			++y;
			x = x + y;
			for(int n = 1; n <= x; n++){
				if(x % n == 0)
					i++;
			}
			
		}
		System.out.print(x);

	}

}