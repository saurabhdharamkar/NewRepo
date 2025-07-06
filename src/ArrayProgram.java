import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayProgram {

    public static void main(String[] args) {

        int[] arr={5,3,9,7,8,4,6,6};

      Optional<Integer> result=  Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
      System.out.println(result.get());

        List<Integer> result1=Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        System.out.println(result1);

        List<Integer> result2=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(ele->ele.getKey()).collect(Collectors.toList());
        System.out.println(result2);

       int sum= Arrays.stream(arr).boxed().reduce(1,(a,b)->a+b);
       System.out.println(sum);
       int max=Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
       System.out.println(max);

      List<Integer> even= Arrays.stream(arr).boxed().filter(ele->ele%2==0).collect(Collectors.toList());
      System.out.println(even);


    }
}
