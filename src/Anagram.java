import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public  static void main(String[] args){
        String s1="LISTEN";
        String s2="SILENT";
        char c1[]= s1.toCharArray();//Converts string to sequence of char
        char c2[]=s2.toCharArray();
        if(c1.length!= c2.length)//check the length of the string
        {
            System.out.println("String is not a anagram");
        }
        Arrays.sort(c1);//sort c1 string char in alphabetical order
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i])
            {
                System.out.println("String is not a anagarm");
            }
        }
        System.out.println("String is anagram");
    }
}
