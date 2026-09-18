class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count = {}
        l = 0
        max_freq = 0
        res = 0
        for r in range(len(s)):
            count[s[r]] = count.get(s[r],0) + 1
            max_freq = max(max_freq, count[s[r]])

            window_size = r -l + 1
            replacements = window_size - max_freq

            if replacements > k:
                count[s[l]] -= 1
                l += 1
            
            res = max(res, r-l +1)
        return res
        