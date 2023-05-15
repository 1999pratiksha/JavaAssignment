public class Palindrome {
    public static void main(String[] args){
        String input="BOB";
        String output="";
        for(int i=input.length()-1;i>=0;i--)
        {
            output=output+input.charAt(i);
        }
        System.out.println(output);
        if(input.equals(output)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not a palindrome");
        }
    }
}
