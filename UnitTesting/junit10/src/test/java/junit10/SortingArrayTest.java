package junit10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void test() {
		try {
			SortingArray sa=new SortingArray();
			int unsorted[]= {1,2,3,5,4,6,9,8};
			int sorted[]=sa.sortingArray(unsorted);
			for(int sor:sorted) {
				System.out.print(sor);
				}
			fail();
			}
		catch(NullPointerException e) {
			System.out.print("Exception generated");
		}
	}

}
