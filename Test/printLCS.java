public class printLCS{

     public static void main(String []args){
        System.out.println("Hello World");
        String str1 = "GXTXAXB";
        String str2 = "AGGTAB";
        
        printLCS lcs = new printLCS();
        
        System.out.println(" longest common sequence size is "+lcs.computeLength(str1,str2));
        
     }
     
     
        public String computeLength(String a, String b){
         int m = a.length();
         int n = b.length();
         
         
         int[][] dp = new int[m+1][n+1];
         
         for(int i = 0; i< m; i++)
            dp[i][0] = 0;
         for(int j = 0; j <n; j++)
            dp[0][j] = 0;
         
         
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <=n ; j++){
                if((a.charAt(i-1)) == (b.charAt(j-1))){
                    dp[i][j] = dp[i-1][j-1] + 1;
           
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        int len = dp[m][n];
        System.out.println(" longest common subsequence is "+len);
        char[] str = new char[len+1];
        str[len] = '\0';
        
        int i = m;
        int j = n;
        while( i > 0 && j > 0 )
        {
            if((a.charAt(i-1)) == (b.charAt(j-1))){
                len--;
                str[len] = a.charAt(i-1);
                i--;
                j--;
                }
            else if(dp[i-1][j] > dp[i][j-1]) {
                
                i--;
            }
            else{
                j--;
            }
            
        }
        
        
        return String.valueOf(str);
         
     }
     
}