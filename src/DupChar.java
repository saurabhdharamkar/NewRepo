import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DupChar {

    public static void main(String[] args) {

        String str="saurabhuh";
        String duplicate=str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(ele->ele.getKey()).map(String::valueOf).collect(Collectors.joining());
        System.out.println(duplicate);

        String removeDuplicate=str.chars().mapToObj(ele->(char)ele).distinct().map(String::valueOf).collect(Collectors.joining());
        System.out.println(removeDuplicate);

        String reverse=IntStream.rangeClosed(1,str.length()).mapToObj(ele->str.charAt(str.length()-ele)).map(String::valueOf).collect(Collectors.joining());
        System.out.println(reverse);

        Map<Character,Long> charOccurance=str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        charOccurance.entrySet().stream().forEach(ele->System.out.print(ele.getKey()+""+ele.getValue()));
    }
}
