package junit8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertTrue {

	@Test
	void test() {
		String str="junit";
		assertTrue(str.equals("junit1"));
	}

}
