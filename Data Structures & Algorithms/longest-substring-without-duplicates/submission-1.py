class Solution:
    def lengthOfLongestSubstring(self, s):
        char_set = set()
        left =0
        maximum =0
        for i in range(len(s)):
            while s[i] in char_set:
                char_set.remove(s[left])
                left += 1
            char_set.add(s[i])
            maximum = max(maximum, i-left +1)
        return maximum
        