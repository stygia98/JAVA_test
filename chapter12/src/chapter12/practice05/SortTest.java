package chapter12.practice05;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		int[] iArray = new int[] {7, 6, 9, 1, 4};
		System.out.println(Arrays.toString(iArray));

		for (int j = 0; j < iArray.length-1; j++) {
			for (int i = j; i < iArray.length; i++) {
				if (iArray[j] < iArray[i]) {
					int temp = iArray[j];
					iArray[j] = iArray[i];
					iArray[i] = temp;
				}//end if
			}//end for
		}//end for
		System.out.println(Arrays.toString(iArray));
	}

}
