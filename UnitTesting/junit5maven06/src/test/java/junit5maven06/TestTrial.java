package junit5maven06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {
	Shapes sh=new Shapes();
	@Test
	void testComputeSquareArea() {
		assertEquals(576,sh.computeSquareArea(24));
	}
	@Test
	void testComputeCirceArea() {
		assertEquals(153.86,sh.computeCircleleArea(7),"Area of circle is wrong");
	}
	@Test
	void testComputeCirceArea_Supplier() {
		assertEquals(1523.86,sh.computeCircleleArea(7),()->"Area of circle is wrong");
	}
	

}
