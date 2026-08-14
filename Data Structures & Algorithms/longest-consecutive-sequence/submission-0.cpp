class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> num;
        for(int i : nums){
            num.insert(i);
        }

        int longest = 0;

        for(int i : num){
            if(num.find(i-1) == num.end()){
                int length = 1;
              
              while(num.find(i+length) != num.end()){
                length++;
              }

               longest = max(longest,length);
            }
        }

        return longest;
    }
};
