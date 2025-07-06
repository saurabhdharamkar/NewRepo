import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateChar1 {

    public static void main(String[] args) {

        String str="aabbccdef";

        Map<Character,Long> mapList=str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Character> intList=mapList.entrySet().stream().filter(ele->ele.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.print(intList);
    }
}
