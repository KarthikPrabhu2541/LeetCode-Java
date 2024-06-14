class Solution {
    public void column(int[][] a,int c,int n){
        for(int i=0;i<n;i++){
            a[i][c]=0;
        }
    }
    public void row(int[][] a,int r,int m){
        for(int i=0;i<m;i++){
            a[r][i]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=matrix[i][j];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0)
                {
                    column(a,j,n);
                    row(a,i,m);
                }
            }
        }
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                matrix[i][j]=a[i][j];
    }
}