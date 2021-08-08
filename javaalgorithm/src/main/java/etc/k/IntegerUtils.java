package etc.k;

public class IntegerUtils {

	/**
	 * Parsing String to int
	 * @param in
	 * @return
	 */
	public static int parseInt(String in){
		int result = 0 ;
		int length = in.length();
		for (int i = 0; i < length; i++) {
			result += (int)(Character.getNumericValue(in.charAt(i)) * Math.pow(10,(length - i -1)));
		}

		return result;
	}
}
