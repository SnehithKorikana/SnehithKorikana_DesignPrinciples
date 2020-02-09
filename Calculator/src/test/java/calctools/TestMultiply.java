package calctools;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiply {

	@Test
	public void test() {
		Multiply m=new Multiply();
		int mu=(int) m.operation(1,2);
		assertEquals(2,mu);
	}

}
