import java.util.*;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class max1 {

    public static void main(String[] args) {

     int [] arr={2,7,1,5,9,8,4,5,7,6,4};

     List<Integer> intList= IntStream.of(arr).boxed().toList();
     List<Integer> num =intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(ele->ele.getKey()).toList();
     System.out.println(num);

     int sum =intList.stream().mapToInt(Integer::intValue).sum();
     System.out.println(sum);

     int sumNum =intList.stream().mapToInt(Integer::intValue).sum();
     int avg=sumNum/2;
     System.out.println("Avg : "+avg);

     OptionalInt max=intList.stream().mapToInt(Integer::intValue).max();
     System.out.println(max.getAsInt());

     OptionalInt min=intList.stream().mapToInt(Integer::intValue).min();
     System.out.println(min.getAsInt());



     System.out.println(intList);

     List<Integer> resultList1=new ArrayList<>();
     List<Integer> resultList2=new ArrayList<>();
     List<Integer> finalResult=new LinkedList<>();

        resultList1=intList.stream().limit(4).sorted().collect(Collectors.toList());
        resultList2=intList.stream().skip(4).collect(Collectors.toList());
       finalResult.addAll(resultList1);
        finalResult.addAll(resultList2);

        System.out.println(finalResult);



    }
}
