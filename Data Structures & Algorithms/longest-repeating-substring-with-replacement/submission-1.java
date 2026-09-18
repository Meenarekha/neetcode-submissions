class Solution {
    public int characterReplacement(String s, int k) {
        int[] count  = new int[26];

        int l = 0;
        int res = 0;
        int max_freq = 0;
        for (int i =0;i<s.length();i++){
            count[s.charAt(i) - 'A']++;
            max_freq = Math.max(max_freq, count[s.charAt(i)-'A']); 

            int window_size = i-l+1;
            int replacements = window_size - max_freq;

            if(replacements > k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            res = Math.max(res, i-l+1);
        }
        return res;
    }

}
