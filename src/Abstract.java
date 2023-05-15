abstract class AB{
    abstract void display(int a,int b);
}
class Addition extends AB{
    @Override
    void display(int a,int b) {
        System.out.println(a+b);
    }
}
public class Abstract {
    public static void main(String[]args){
       Addition obj=new Addition();
        obj.display(10,5);
    }
}
