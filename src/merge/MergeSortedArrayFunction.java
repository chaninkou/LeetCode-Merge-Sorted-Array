package merge;

import java.util.Arrays;

public class MergeSortedArrayFunction {
	// Old solution
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        // num1 empty space length
//        int i = m - 1;
//        
//        // num2 length
//        int j = n - 1;
//        
//        // Last index of the total length
//        int k = m + n - 1;
//
//        // When neither of them is negative
//        while(i >= 0 && j >= 0){
//            // if num1 element is bigger than num2 element, then put it in the back of num1
//            if(nums1[i] > nums2[j]){
//                // i-- since nums1 finished inserting one element
//                nums1[k] = nums1[i];
//                k--;
//                i--;
//            }else{
//                // j-- since nums2 finished inserting one element
//                nums1[k] = nums2[j];
//                k--;
//                j--;    
//            }
//        }
//        
//        // If there is still element in num2
//        while(j >= 0){
//            nums1[k] = nums2[j];
//            k--;
//            j--;
//        }
//
//    }
	
	// New solution with better format
	public void merge(int[] nums1, int m, int[] nums2, int n){
		// The index we start inserting, it should be the last element of nums1
		int emptyIndex = m + n - 1;
		
		// Since m and n is the size, do - 1 to get the actual index
		m = m - 1;
		n = n - 1;
		
		// While we haven't finish going through either array
		while(m >= 0 && n >= 0){
			// If first pointer is bigger than second pointer
			if(nums1[m] > nums2[n]){
				// Bigger element should go in the back
				nums1[emptyIndex] = nums1[m];
				
				// update pointers
				m--;
				emptyIndex--;
			} else { // Means that nums2 is bigger than nums1
				// This is the other way around
				nums1[emptyIndex] = nums2[n];
				
				// update pointers
				n--;
				emptyIndex--;
			}
		}
		
		// Checking if we went through the second array yet, since nums1 array should be at the correct index already
		while(n >= 0){
			nums1[emptyIndex] = nums2[n];
			
			// update pointers
			n--;
			emptyIndex--;
		}
	
	}
}
