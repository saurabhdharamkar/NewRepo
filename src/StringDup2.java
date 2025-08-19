import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDup2 {

    public static void main(String[] args) {

        String str="SaurabhS";

        String duplicate=str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(Map.Entry::getKey).map(String::valueOf).collect(Collectors.joining());
        System.out.print(duplicate);
    }
}
