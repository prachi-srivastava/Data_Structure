
import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        System.out.println(subseqList("","abc"));
        int [] arr = {1,2,2};
        //List<List<Integer>> ans = subseqIteration(arr);
        List<List<Integer>> ans = subsetDuplicate(arr);
        
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    
    static List<List<Integer>> subsetDuplicate( int [] arr ){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        
        outer.add(new ArrayList<Integer>());
        
        int start = 0, end = 0;
        
        
        for(int i = 0 ; i <arr.length; i++){
            start = 0;
            
            if(i > 0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size() -1;
            int n = outer.size();
            for(int j = start ; j < n ;j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
            
            
        }
        return outer;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    static List<List<Integer>> subseqIteration( int [] arr ){
        List<List<Integer>> outer = new ArrayList<>();
        
        outer.add(new ArrayList<Integer>());
        
        for(int nums : arr){
            int n = outer.size();
            for(int i = 0 ; i < n ;i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(nums);
                outer.add(inner);
            }
            
            
        }
        
        
        
        return outer;
    }
    
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
        return;
    }
    
    static ArrayList<String> subseqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqList(p+ch,up.substring(1));
        ArrayList<String> right = subseqList(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    
    
    
}
