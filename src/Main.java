
public class Main {


	public static void main(String[] args) {
		//FactolrialClass object = new FactolrialClass();
		System.out.printf("%s\n", FactolrialClass.factorial(100));
		String string = FactolrialClass.factorial(100);
		int[] intArray = new int[string.length()];
		int sum = 0;
		 
		for (int i = 0; i < string.length(); i++) {
			intArray[i] = Character.digit(string.charAt(i), 10);
			sum = sum + intArray[i];
		}
		System.out.print(sum);

	}

}
