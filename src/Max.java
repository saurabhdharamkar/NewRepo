import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Max {

    public static void main(String[] args) {

        List<Integer> intList=List.of(2,1,5,5,6,4,8,7,5,4);

        OptionalInt max=intList.stream().mapToInt(Integer::intValue).max();
        System.out.println(max.getAsInt());

        Optional<Integer> secondMax=intList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondMax.get());

        int sum=intList.stream().mapToInt(Integer::intValue).sum();
        System.out.print(sum);

        List<Integer> result=new ArrayList<>();
        result=intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(ele->ele.getKey()).toList();
        System.out.println(result);

         intList.stream().distinct().forEach(ele->System.out.println(ele+" "));

         List<Integer> ascendingOrder=new ArrayList<>();

        ascendingOrder=intList.stream().distinct().sorted(Comparator.comparing(Integer::intValue)).toList();
        System.out.println(ascendingOrder);


    }
}
