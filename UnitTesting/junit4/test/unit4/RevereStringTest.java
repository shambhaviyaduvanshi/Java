package unit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RevereStringTest {
	ReverseString rev=new ReverseString();
	@Test
	void testReverseString_oneWord() {
		assertEquals("avaj",rev.reverseString("java"));
	}
	@Test
	void testReverseString_MultipleWords() {
		assertEquals("ysae si avaj",rev.reverseString("java is easy"));
	}

}
