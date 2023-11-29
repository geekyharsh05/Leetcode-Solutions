class Solution {
  public int minGroups(int[][] intervals) {
    Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);

    Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

    for (int[] interval : intervals) {
      if (!minHeap.isEmpty() && interval[0] > minHeap.peek()) {
        minHeap.poll(); 
      }
      minHeap.offer(interval[1]);
    }

    return minHeap.size();
  }
}