class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int r = people.length-1;
        int l = 0;
        int res = 0;
        while(l<=r){
            if (people[l]+people[r]<= limit){
                l+=1;
            }
            r-=1;
            res+=1;
        }
        return res;
    }
}