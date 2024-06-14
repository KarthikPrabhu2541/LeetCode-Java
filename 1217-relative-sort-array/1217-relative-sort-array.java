class Solution {
    public int findIndex(int arr1[],int i,int k){
        
        for(;k<arr1.length;k++){
            if(arr1[k]==i)
                return k;
        }
        return -1;
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int cur=0;
        for(int ele:arr2){
            // System.out.println("arr2 ele= "+ele);
            int index=0;
            do{
                index=findIndex(arr1,ele,cur);
                // System.out.println("arr1 index= "+index);
                if(index!=-1){
                    // System.out.println(index+" "+arr1[index]+" "+cur+" "+arr1[cur]);
                    int temp=arr1[cur];
                    arr1[cur]=arr1[index];
                    arr1[index]=temp;
                    cur++;
                }
            }while(index!=-1);
            // for(int k:arr1)
            // System.out.print(k+" ");
            // System.out.println();
        }
        int[] last=new int[arr1.length-cur];
        int a=0;
        for(int i=cur;i<arr1.length;i++)
            last[a++]=arr1[i];
        Arrays.sort(last);
        a=0;
        for(int i=cur;i<arr1.length;i++)
            arr1[i]=last[a++];
        return arr1;
    }
}