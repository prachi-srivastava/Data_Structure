public class LCS{

     public static void main(String []args){
        System.out.println("Hello World");
        String str1 = "GXTXAXB";
        String str2 = "AGGTAB";
        
        LCS lcs = new LCS();
        int n;
        n = lcs.computeLength(str1,str2);
        
        System.out.println(" longest common sequence is "+n);
     }
     
     
        public int computeLength(String a, String b){
         int n = a.length();
         int m = b.length();
         
         
         int[][] dp = new int[n+1][m+1];
         
         // 0th row and 0th column will represent the empty
         // subsequence
         
         for(int i = 0; i< m; i++)
            dp[i][0] = 0;
         for(int j = 0; j <n; j++)
            dp[0][j] = 0;
         
         
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=m ; j++){
                if((a.charAt(i-1)) == (b.charAt(j-1))){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        
        return dp[n][m];
         
     }
     
}