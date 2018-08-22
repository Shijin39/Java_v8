import java.util.ArrayList;
import java.util.List;

public class LambdaEx1 {

    public  static void main(String ar[]){

        List<Integer> l=new ArrayList<>();
        l.add(34);
        l.add(367);
        l.add(233);
        l.add(334);
        l.add(88);

        l.forEach(n -> System.out.println(n));
        System.out.println("Filtering even numbers..");
        l.forEach(n -> {if(n%2==0)System.out.println(n);});



    }

}
