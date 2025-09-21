class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] data = new int[size];
        int i = 0, j = 0, k = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                data[k] = nums1[i];
                i++;
            } else {
                data[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while (i < nums1.length) {
            data[k] = nums1[i];
            i++;
            k++;
        }
        
        while (j < nums2.length) {
            data[k] = nums2[j];
            j++;
            k++;
        }
        
        if (size % 2 == 0) {
            return (data[size / 2] + data[(size / 2) - 1]) / 2.0;
        }
        return data[size / 2];
    }
}
