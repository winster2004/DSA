class Solution {
    public void setZeroes(int[][] m) {
        int r=m.length;
        int l=m[0].length;

        boolean[] zr=new boolean [r];
        boolean[] zl=new boolean [l];

        for(int i=0;i<r;i++){
            for(int j=0;j<l;j++){
                if(m[i][j]==0){
                    zr[i]=true;
                    zl[j]=true;
                }
            }
        }

        for(int i=0;i<r;i++){
            if (zr[i]){
                for(int j=0;j<l;j++){
                    m[i][j]=0;
                }
            }
        }

        for(int i=0;i<l;i++){
            if (zl[i]){
                for(int j=0;j<r;j++){
                    m[j][i]=0;
                }
            }}
        
    }
}