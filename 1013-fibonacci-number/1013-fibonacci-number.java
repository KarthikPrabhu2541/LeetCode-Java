class Solution {
    int a[]=new int[31];
    public int fib(int n) {
       if(n==0)
        return 0;
       else if(n==1)
        return 1;
       if(a[n]!=0)
        return a[n];
       return a[n]=fib(n-1)+fib(n-2); 
    }
}