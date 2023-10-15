import java.util.*;
import java.io.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        int n=nums.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=i;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]>nums[j])
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int i=0,j=n-1;
        while(i<=j)
        {
            if(nums[i]+nums[j]==target)
            {
                ans[0]=a[i];
                ans[1]=a[j];
                return ans;
            }
            else if(nums[i]+nums[j]<target)
                i++;
            else if(nums[i]+nums[j]>target)
                j--;
        }
        return ans;
    }
}