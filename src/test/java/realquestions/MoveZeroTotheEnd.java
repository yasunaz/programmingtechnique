package realquestions;

import java.util.Arrays;

public class MoveZeroTotheEnd {

	public static void main(String[] args) {
		int[] munbers = {0, 2, 0, 5, 0, 1, 0, 5, 0, 9, 4, 1};
		moveZeroToEnd(munbers);
		
	}
	
	static public void moveZeroToEnd(int[] original) {
		int[] temp = new int[original.length];
		int tempIdx = 0;
		
		for(int i = 0; i < original.length; i++ ) {
			if(original[i] > 0) {
				temp[tempIdx] = original[i];
				tempIdx++;
			}
		}
		
		System.out.println( Arrays.toString(temp) );
	}
}
