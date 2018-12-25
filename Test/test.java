public class Permutation{

     public static void main(String []args){
        System.out.println("Hello df134");
        String str = "MARTY";
        Permutation permutation = new Permutation();
        permutation.permute(" ", str, str.length());
     }
     
     
     
     public void permute( String chosen, String available, int nn ){
         int n = available.length();
       //  System.out.println(available);
         if(n==0){
             System.out.println(chosen);
         }
         else{
             for(int i = 0; i < available.length(); i++){
                 // choose c
                 // here c =  available.charAt(i);
                 
                 // explore with c
                  permute(chosen + available.charAt(i), available.substring(0,i)+available.substring(i+1,n), nn);
                 // unchoose c
                 // As we have not actually added c to passed arguments
                 // we dont have to worry about unchoosing it.
                 
                 
                 
             }
             
         }
     }
}`