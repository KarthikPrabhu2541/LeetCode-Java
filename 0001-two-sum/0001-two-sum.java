import java.util.*;
import java.io.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x=0,y=0,v=nums.length;
        int[] a=new int[2];
        for(int i=0;i<v;i++)
        {
           x=nums[i] ;
           for(int j=i+1;j<v;j++)
{
               y=nums[j];
               if((x+y)==target)
                   {
                  a[0]=i;
                   a[1]=j;
                   break;
               }
           }
        }
        return a;
    }
}