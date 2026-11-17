class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n>m){
            return false;
        }
        int[] s1_count =new int[26];
        int[] s2_count = new int[26];
        
        for(int i =0;i<n;i++){
            s1_count[s1.charAt(i)-'a']++;
            s2_count[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1_count, s2_count)){
            return true;
        }

        for(int i = n;i<m;i++){
            s2_count[s2.charAt(i) -'a']++;
            s2_count[s2.charAt(i-n) - 'a']--;

            if(Arrays.equals(s1_count, s2_count)){
                return true;
            }
        }
    return false;
    }
}
