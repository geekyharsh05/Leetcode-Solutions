class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int[] arrivalTime = new int[n];

        // Calculate arrival times
        for (int i = 0; i < n; ++i) {
            arrivalTime[i] = (dist[i] - 1) / speed[i];
        }
        // Sort arrival times
        Arrays.sort(arrivalTime);

        // Check if the weapon can be used before a monster arrives
        for (int i = 0; i < n; ++i) {
            if (i > arrivalTime[i])
                return i;
        }
        // All monsters can be eliminated
        return n;
    }
}