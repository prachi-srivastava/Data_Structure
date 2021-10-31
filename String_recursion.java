// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Stream {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str = "baccdah";
        skip("",str);
        //System.out.println(str);
    }
    
    static void skip(String p , String up){
        if(up.isEmpty()){
        System.out.println(p);
        return;
            
        }
        char ch  = up.charAt(0);
        if (ch == 'a'){
            skip(p,up.substring(1));
        }
        else
            skip(p+ch,up.substring(1));
    return;        
    }
}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Stream {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str = "baccdah";
        
        System.out.println(skip(str));
    }
    
    static String skip(String up){
        if(up.isEmpty()){
      
        return " ";
            
        }
        char ch  = up.charAt(0);
        if (ch == 'a'){
            return skip(up.substring(1));
        }
        else
            return ch + skip(up.substring(1));
           
    }
}


class Stream {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str = "bacapplecdah";
        
        System.out.println(skipApple(str));
    }
    
    static String skipApple(String up){
        if(up.isEmpty())
            return " ";
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else
            return  up.charAt(0)+ skipApple(up.substring(1));
           
    }
  
  static String skipAppNotApple(String up){
        if(up.isEmpty())
            return " ";
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else
            return  up.charAt(0)+ skipAppNotApple(up.substring(1));
           
    }
  
  
}


