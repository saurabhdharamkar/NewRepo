import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindBupCharacter {

    public static void main(String[] args) {

        String str="saurabhah";

       List<Character> charList= str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(ele->ele.getKey()).collect(Collectors.toList());

       System.out.println(charList);
    }
}
