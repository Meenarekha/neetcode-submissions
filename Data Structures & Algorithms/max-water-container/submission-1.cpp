class Solution {
public:
    int maxArea(vector<int>& heights) {
        int area = 0;
        int i = 0, j = heights.size()-1;
        while(i<j){
            int w = j-i;
            int h = min(heights[i], heights[j]);
            area = max(area, h*w);
            if(heights[i]<= heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return area;
    }
};
