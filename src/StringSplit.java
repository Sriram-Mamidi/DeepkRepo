
public class StringSplit {

	public static void main(String[] args) {

		String str = "aabababababababa";

		int length = str.length();
		int splitLentgh = 3;
		int rem = length % splitLentgh;
		int splitRate = (length / splitLentgh) ;
		int temp = 0;
		String[] outputStr = new String[splitLentgh+ rem];

		for (int i = 0; i < str.length(); i += splitRate) {

			// aabab
			String substring = str.substring(i, i + splitRate);

			outputStr[temp] = substring;
			System.out.println(substring);
			temp++;

		}
		for (int i = 0; i < outputStr.length; i++) {
			System.out.println(outputStr[i]);
		}

	}

}
