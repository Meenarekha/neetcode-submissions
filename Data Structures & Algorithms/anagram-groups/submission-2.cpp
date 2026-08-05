class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> groups;

        for (string s : strs){
            int count[26] = {0};

            for(char ch : s){
                count[ch - 'a']++;
            }
            string key = to_string(count[0]);
            for(int i =0;i<26;i++){
                key += ','+to_string(count[i]);
            }
            groups[key].push_back(s);
        }

        vector<vector<string>> result;
        for(auto i : groups){
            result.push_back(i.second);
        }

        return result;

        
    }
};
