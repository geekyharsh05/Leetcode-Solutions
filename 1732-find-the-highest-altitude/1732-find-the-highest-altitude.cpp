class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int maxHeight = 0, initialHeight = 0;
        
        for (int i = 0; i < gain.size(); ++i) {
            initialHeight += gain[i];
            maxHeight = max(maxHeight, initialHeight);
        }
        return maxHeight;
    }
};

