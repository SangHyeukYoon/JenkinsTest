import static org.junit.Assert.*;

import org.junit.Test;

public class AdderTest {

	@Test
	public void test() {
		Adder adder = new Adder();
		int result = adder.Add(10, 20);
		
		assertEquals(result, 10 + 21);
	}

}
