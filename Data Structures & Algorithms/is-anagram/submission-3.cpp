class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length()!= t.length()){
            return false;
        }
        int count[26] ={0};
        for(char i : s){
            count[i-'a']++;
        }
        for(char j : t){
            count[j-'a']--;
        }
        for(int i : count){
            if(i != 0){
                return false;
            }
        }
        return true;
        
    }
};
