import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Max2 {

    public static void main(String[] args) {

        String str="abcdabc";

        List<Character> charList;
        charList=str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(ele->ele.getKey()).toList();
        System.out.print(charList);
    }
}
