class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> l=new ArrayList<>();
        for(int x:nums)
            l.add(x);
        Collections.sort(l);
        int[] num=new int[n];
        for(int i=0;i<n;i++)
            num[i]=l.indexOf(nums[i]);
        return num;
    }
}