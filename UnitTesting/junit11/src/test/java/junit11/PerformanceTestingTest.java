package junit11;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class PerformanceTestingTest {

	@Test
	void test() {
		PerformanceTesting pc=new PerformanceTesting();
		int unsorted[]= {3,2,1};
		assertTimeout(Duration.ofMillis(10),()->pc.sortingArray(unsorted));
	}

}
