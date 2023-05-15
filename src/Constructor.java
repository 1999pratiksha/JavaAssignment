class sample {
   sample(int a,int b) {
      System.out.println(a + b);
  }
   sample(int a,double b){
      System.out.println(a*b);
  }
   sample(int a,double b,float c)
  {
      System.out.println(a+b+c);
  }
  public static void main(String[] args){
      new sample(10,20);
      new sample(5,0.01);
      new sample(10,0.05,14f);
  }
}
