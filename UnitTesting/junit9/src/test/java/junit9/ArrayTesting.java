package junit9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayTesting {

	@Test
	void test() {
		int expected[]= {1,2,3,4,5,6};
		int actual[]= {1,6,3,4,5,2};
		Arrays.sort(actual);
		assertArrayEquals(actual,expected);
	}

}
