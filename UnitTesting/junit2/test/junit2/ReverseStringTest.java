package junit2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString rs=new ReverseString();
		assertEquals("avaj",rs.reverseString("java"));
	}

}
