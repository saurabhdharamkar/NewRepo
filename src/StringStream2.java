import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringStream2 {

    public static void main(String[] args) {

        String str="Saurabh";

        String newStr=str.chars().mapToObj(ele->(char)ele).distinct().map(String::valueOf).collect(Collectors.joining());
        System.out.println(newStr);

        Map<Character,Long> mapList= str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Character> repeat=mapList.entrySet().stream().filter(ele->ele.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.print(repeat);

        String reverse= IntStream.rangeClosed(1,str.length()).mapToObj(i->str.charAt(str.length()-i)).map(String::valueOf).collect(Collectors.joining());
        System.out.println(reverse);

        long count=str.chars().count();
        System.out.println(count);

        List<Character> chars=str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(ele->ele.getKey()).collect(Collectors.toList());
        System.out.println(chars);

        String strn=IntStream.rangeClosed(1,str.length()).mapToObj(ele->str.charAt(str.length()-ele)).map(String::valueOf).collect(Collectors.joining());
        System.out.println(strn);
    }
}
