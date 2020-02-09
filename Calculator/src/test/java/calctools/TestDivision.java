package calctools;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDivision {

	@Test
	public void test() {
		Division d=new Division();
		int div=(int) d.operation(2,1);
		assertEquals(2,div);
		}

}
