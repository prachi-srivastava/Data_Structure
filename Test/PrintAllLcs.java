
import java.util.*; 
public class printLCS{


    String str1;
    String str2; 
        
    int m;
    int n;
    
    int len;
         
    int[][] dp;
     


    public static void main(String []args){
        System.out.println("Hello 78World");
         
        printLCS lcs = new printLCS();
        lcs.str1 = "ABCBDAB";
        lcs.str2 = "BDCABA";
        lcs.m = lcs.str1.length();
        lcs.n = lcs.str2.length();
        
        lcs.dp  = new int[lcs.m+1][lcs.n+1];
        System.out.println(" longest common sequence is "+lcs.computeLength(lcs.str1,lcs.str2));
        
        lcs.len = lcs.dp[lcs.m][lcs.n];
        System.out.println(" Length is "+lcs.len);
        
        HashSet<String> str_list = new HashSet<String>();
        lcs.printAll(str_list, 0, "",lcs.m,lcs.n);
        System.out.println(str_list);
        
     }
     
     
        public String computeLength(String a, String b){
        
         
         // Base cases for dp matrix
         for(int i = 0; i< m; i++)
            dp[i][0] = 0;
         for(int j = 0; j <n; j++)
            dp[0][j] = 0;
         
         
         // dp matrix calculation
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
        
        
        
        // printing subseuence
        int len = dp[m][n];
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
     
     
      void printAll(HashSet<String> str_list, int a, String str,int x, int y){
          
         if(a == len){
             str_list.add(str);
         }
         else{
             
			// We have got one of the common char in both the strings, so we add it to our subsequence 
                if(str1.charAt(x-1) == str2.charAt(y-1))
                {
                    printAll(str_list,a+1,str1.charAt(x-1)+str,x-1,y-1);
                }
                else {
                    
                    if(dp[x-1][y] == dp[x][y-1])
                    {
                        printAll(str_list,a,str,x-1,y);
                        printAll(str_list,a,str,x,y-1);
                    }
                    else if(dp[x-1][y] > dp[x][y-1])
                    {
                        printAll(str_list,a,str,x-1,y);
                    }
                    else
                    {
                        printAll(str_list,a,str,x,y-1);
                    }
                }
                
            }
        
     
         
     }
     
}