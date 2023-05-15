interface  A{
    void show(int a,int b);
}
interface B{
    void display(int a,float b);
}
class Interface implements A,B{
    @Override
    public void show(int a,int b) {
        System.out.println(a+b);
    }

    @Override
    public void display(int a,float b) {
        System.out.println(a*b);
    }
    public static void main(String[] args){
        Interface m=new Interface();
        m.show(10,5);
        m.display(5,2f);
    }
}


