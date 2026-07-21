class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for (int i:nums){
            int c=0;
            int n=i;

        while(n>0){
            n/=10;
            c+=1;
        }
        if(c%2==0){
            count++;
        }
        }
        return count;
    }
}