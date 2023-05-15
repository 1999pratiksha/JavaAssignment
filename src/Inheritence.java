import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class cal1{
    public int cal_add(int x, int y) {
        return x+y;
        }
    }
    class cal2 extends cal1{
        public int cal_mul(int x, int y) {
            return x*y;
        }
    }
    class cal3 extends cal2{
        public int cal_div(int x, int y) {
            return x / y;
        }
    }
    public class Inheritence {
        public static void main(String[] args) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            cal3 c=new cal3();
            System.out.println("Enter the value of X: ");
            int i=Integer.parseInt(br.readLine());
            System.out.println("Enter the value of y: ");
            int j=Integer.parseInt(br.readLine());
            int a=c.cal_add(i,j);
            int b=c.cal_mul(i,j);
            int d=c.cal_div(i,j);
            System.out.println(a);
            System.out.println(b);
            System.out.println(d);
        }
}
