class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        
        while (first <= last) {
            final int mid = first + (last - first) / 2;
            
             if (arr[mid] < arr[mid + 1]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
          return first;
    }
}