//buffer-builder used when we want to modify strings in use

// public class stringBufferBuilder { //buffer
//     public static void main(String[] args) {
//         StringBuffer stringBuffer = new StringBuffer("sweta");
//        stringBuffer.reverse();  
//        stringBuffer.insert(1, "ss"); 
//        stringBuffer.append("sahoo"); 
//        System.out.println(stringBuffer.charAt(2)); 
//        System.out.println(stringBuffer.length()); 
//        System.out.println(stringBuffer.substring(0, stringBuffer.length()));
//        System.out.println(stringBuffer.substring(0));
//        System.out.println(stringBuffer.substring(0, 2));
//         System.out.println(stringBuffer);
//     }
// }


public class stringBufferBuilder {  //builder-faster tan buffer as its more synchronized
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("sweta");
       stringBuilder.reverse(); 
       stringBuilder.insert(3, "ss"); 
       stringBuilder.append("sahoo");   
       System.out.println(stringBuilder.charAt(2));  
       System.out.println(stringBuilder.length());  
       System.out.println(stringBuilder.substring(0, stringBuilder.length()));   
       System.out.println(stringBuilder.substring(0)); 
       System.out.println(stringBuilder.substring(0, 2));
        System.out.println(stringBuilder);
    }
}