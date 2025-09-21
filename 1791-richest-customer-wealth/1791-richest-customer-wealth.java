class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<accounts.length;i++){
            int rowSum=0;
            for(int j=0;j<accounts[i].length;j++){
                rowSum+=accounts[i][j];
                if(rowSum>max){
                    max=rowSum;
                }
            }
        }

        return max;


        
    }
}