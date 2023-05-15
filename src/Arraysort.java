import java.util.Arrays;
import java.util.Scanner;

public class Arraysort {
    public static void main(String[] args)
    {
//defining an array of integer type
        int [] array = new int [] {89, 7, 15, 109, 12, 27, 68, 35};
//invoking sort() method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}

