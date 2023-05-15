import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicatearray {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Activa");
        l.add("Avaitor");
        l.add("Bike");
        l.add("Activa");
        l.add("Banana");
        System.out.println(l.toString());
        Set<String> s = new LinkedHashSet<String>(l);
        System.out.println(s);
    }
}
