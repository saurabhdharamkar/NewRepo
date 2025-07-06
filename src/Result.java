import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Result {

    public static void main(String[] args) {

        String str="Saurabh";

        String dist=str.chars().mapToObj(ele->(char)ele).distinct().map(String::valueOf).collect(Collectors.joining());

        String dup=str.chars().mapToObj(ele->(char)ele).distinct().map(String::valueOf).collect(Collectors.joining());

        System.out.print(dup);

       String repeat= str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(String::valueOf).collect(Collectors.joining());
        System.out.println(repeat);

     /*   Map<Character,Long> dup=str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       String dup1=dup.entrySet().stream().filter(ele->ele.getValue()>1).map(Map.Entry::getKey).map(String::valueOf).collect(Collectors.joining());
       System.out.print(dup1);*/
    }
}
