package merge;

import java.util.Arrays;

public class MergeSortedArrayFunction {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // num1 empty space length
        int i = m - 1;
        
        // num2 length
        int j = n - 1;
        
        // Last index of the total length
        int k = m + n - 1;

        // When neither of them is negative
        while(i >= 0 && j >= 0){
            // if num1 element is bigger than num2 element, then put it in the back of num1
            if(nums1[i] > nums2[j]){
                // i-- since nums1 finished inserting one element
                nums1[k] = nums1[i];
                k--;
                i--;
            }else{
                // j-- since nums2 finished inserting one element
                nums1[k] = nums2[j];
                k--;
                j--;    
            }
        }
        
        // If there is still element in num2
        while(j >= 0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }

    }
}
