package calctools;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSubtract {

	@Test
	public void test() {
		Subtract s=new Subtract();
		int sub=(int) s.operation(2,1);
		assertEquals(1,sub);
	}

}
