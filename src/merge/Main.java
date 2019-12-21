package merge;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		
		int m = 3;
		
		int[] nums2 = {2,5,6};
		
		int n = 3;
		
		System.out.println("nums1: " + Arrays.toString(nums1) + " m: " + m);
		
		System.out.println("nums2: " + Arrays.toString(nums2) + " n: " + n);
		
		MergeSortedArrayFunction solution = new MergeSortedArrayFunction();
		
		solution.merge(nums1, m, nums2, n);
		
		System.out.println("Solution: " + Arrays.toString(nums1));
	}
}
