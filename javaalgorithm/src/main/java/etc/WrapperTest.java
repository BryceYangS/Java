package etc;

public class WrapperTest {

	public static void main(String[] args) {
		Integer a = new Integer(1);
		Integer b = new Integer(1);

		System.out.println(a.equals(b)); // true
		System.out.println(a == b); // false
		System.out.println(1 == a); // true
		System.out.println(1 == b); // true

		String str1 = "test";
		String str2 = "test";

		System.out.println(str1 == str2); // true

	}
}
