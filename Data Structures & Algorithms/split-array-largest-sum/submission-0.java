class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int  right = 0;
        for(int i : nums){
            left = Math.max(left, i);
            right += i;
        }

        while(left<right){
            int mid = left + (right-left)/2;
            int count = 1;
            int sum =0;
            for(int i : nums){
                if(sum + i > mid){
                    count++;
                    sum = i;
                }else{
                    sum += i;
                }
            }
            if(count >k){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        return  left;
    }
}