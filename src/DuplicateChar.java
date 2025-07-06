import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateChar {

    public static void main(String[] args) {

        String str="programming";

      String removeDuplicate=str.chars().mapToObj(ele->(char)ele).distinct().map(String::valueOf).collect(Collectors.joining());
      //System.out.print(removeDuplicate);

        Map<Character,Long> mapList=str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        String duplicate=mapList.entrySet().stream().filter(ele->ele.getValue()>1).map(String::valueOf).collect(Collectors.joining());

        //System.out.print(duplicate);

        String reverse=IntStream.rangeClosed(1,str.length()).mapToObj(ele->str.charAt(str.length()-ele)).map(String::valueOf).collect(Collectors.joining());
        System.out.print(reverse);

    }
}
