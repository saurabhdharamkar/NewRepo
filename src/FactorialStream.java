import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FactorialStream {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,2,3,4,5);

        int fact =intList.stream().reduce(1,(a,b)->a+b);
        System.out.println(fact);

        int max=intList.stream().mapToInt(Integer::intValue).max().orElse(Integer.MAX_VALUE);

        System.out.println(max);

       Optional<Integer> max1= intList.stream().sorted(Comparator.reverseOrder()).limit(1).findFirst();
       System.out.println(max1.get());



    }



}
