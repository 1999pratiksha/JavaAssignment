public class Arraysmallest {
    public static void main(String[] args) {
        int[] arr={8,3,4,5,7};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){   //8<8 =false//3<8-true
                min=arr[i];   //min=3
            }
        }
        System.out.println("Minimum number is:"+min);

    }
}