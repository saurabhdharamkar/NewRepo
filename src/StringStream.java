import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringStream {

    public static void main(String[] args) {


        String str="Tree";

      String normal=str.chars().mapToObj(ele->(char)ele).distinct().map(String::valueOf).collect(Collectors.joining());
      //System.out.print(normal);

        String reverse=IntStream.rangeClosed(1,str.length()).mapToObj(ele->str.charAt(str.length()-ele)).map(String::valueOf).collect(Collectors.joining());
        //System.out.print(reverse);

        Map<Character,Long> mapList=str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Character> repeat=mapList.entrySet().stream().filter(ele->ele.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());


    }
}
