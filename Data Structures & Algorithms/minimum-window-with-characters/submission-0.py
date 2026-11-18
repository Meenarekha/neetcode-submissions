class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(s) < len(t):
            return ""
        
        need = [0] * 128

        for c in t:
            need[ord(c)] += 1

        left = 0
        right = 0

        required = len(t)
        min_len = float('inf')
        start = 0

        while right < len(s):
            c = s[right]
            if need[ord(c)] >0:
                required -= 1
            
            need[ord(c)] -= 1
            right +=1

            while required == 0:

                if right - left < min_len:
                    min_len = right-left
                    start =left
                

                leftchar = s[left]
                need[ord(leftchar)] += 1

                if need[ord(leftchar)] >0:
                    required +=1
                
                left += 1
        if min_len == float('inf'):
            return ""
        
        return s[start:start+min_len]
