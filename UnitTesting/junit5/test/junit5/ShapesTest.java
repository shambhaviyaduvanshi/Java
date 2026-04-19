package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes sh=new Shapes();
	@Test
	void testComputeSquareArea() {
		assertEquals(576,sh.computeSquareArea(24));
	}
	@Test
	void testComputeCirceArea() {
		assertEquals(153.86,sh.computeCircleleArea(7),"Area of circle is wrong");
	}

}
