class Solution {
public:
    bool isValid(string s) {
        stack<char> c;
        for(char i : s){
            if(i == '(' || i == '{'|| i == '['){
                c.push(i);
            }else{
                if(c.empty()){
                    return false;
                }
                else if(i==')' && c.top() != '('){
                    return false;
                }
                else if(i=='}' && c.top() != '{'){
                    return false;
                }
                else if(i==']' && c.top() != '['){
                    return false;
                }
                c.pop();
            }
        }
        return c.empty();
    }
};
