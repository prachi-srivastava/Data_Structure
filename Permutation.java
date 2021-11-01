import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Permutation {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ArrayList<String> ans = permute_1("","abc");
      //  for(String list : ans)
            System.out.println(ans);
    }
    
    
    
    static ArrayList<String> permute_1(String p, String up){
        ArrayList<String> str = new ArrayList<String>();    
        if(up.isEmpty()){
            str.add(p);
            return str;
        }
        
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length(); i++ ){
             ArrayList<String> sub = new ArrayList<String>();
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            sub = permute_1(f+ch+s,up.substring(1));
            str.addAll(sub);
        }
         return str;
    }
    
    
    
    static void permute(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length(); i++ ){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permute(f+ch+s,up.substring(1));
        }
         return;
    }
}
