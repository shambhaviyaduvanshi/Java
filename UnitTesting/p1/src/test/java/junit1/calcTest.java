package junit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calcTest {

	@Test
	void test() {
		calc c=new calc();
		int testres =c.divide(10, 5);
		assertEquals(2,testres);
	}

}
