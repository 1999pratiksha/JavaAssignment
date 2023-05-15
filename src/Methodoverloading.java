public class Methodoverloading {
    public static void cal(float x,float y)
    {
        System.out.println(x+y);
    }
    public static void cal(int a,int b, int c)
    {
            System.out.println(a+b+c);
    }
    public static void cal(int i,int j,int k,int l)
    {
        System.out.println(i*j*k*l);
    }
    public static void cal(String m){
        System.out.println(m);
    }

    public static void main(String[] args) {
            cal(3.7f,5.8f);
            cal(2,4,8);
            cal(2,4,6,9);
            cal("prati");
        }

}
