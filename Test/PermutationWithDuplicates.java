
import java.util.*; 

public class PermutationWithDuplicates{

     public static void main(String []args){
        System.out.println("Hello df8134");
        String str = "ABB";
        HashSet<String> str_list = new HashSet<String>();
        PermutationWithDuplicates permutation = new PermutationWithDuplicates();
        permutation.permute(" ", str, str_list);
     }
     
     
     
     public void permute( String chosen, String available, HashSet<String> str_list ){
         int n = available.length();
       //  System.out.println(available);
         if(n==0){
             if(!str_list.contains(chosen)){
             System.out.println(chosen);
             str_list.add(chosen);
             }
         }
         else{
             for(int i = 0; i < available.length(); i++){
                 // choose c
                 // here c =  available.charAt(i);
                 
                 // explore with c
                  permute(chosen + available.charAt(i), available.substring(0,i)+available.substring(i+1,n),str_list);
                 // unchoose c
                 // As we have not actually added c to passed arguments
                 // we dont have to worry about unchoosing it.
                 
                 
                 
             }
             
         }
     }
}