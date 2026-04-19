package junit11;

import java.util.Arrays;

public class PerformanceTesting {
	public int[]sortingArray(int arr[]){
		for(int i=0;i<1000000;i++) {
			Arrays.sort(arr);
		}
		return arr;
		
	}
}
