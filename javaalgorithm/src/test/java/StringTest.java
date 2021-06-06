import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StringTest {

	@Test
	public void str() throws Exception {
		// given
		String constantString = "Bryce";
		String newString = "Bryce";

		Assertions.assertThat(constantString).isSameAs(newString);
	}

	@Test
	public void str2() throws Exception {
		// given
		String constantString = "Bryce";
		String newString = new String("Bryce");

		Assertions.assertThat(constantString).isNotSameAs(newString);
	}

}
