public class Repeatedchar {
    public static void main(String[] args)
    {
     String s="javatester";

     for(int i=0;i<s.length();i++)
     {
         int count=0;
         for(int j=0;j<s.length();j++){
             if(s.charAt(i)==s.charAt(j)){
                 count++;
             }
         }
         if(count>1){
             System.out.println("Repeated charater is: "+s.charAt(i));
             break;
         }
     }
    }
}
