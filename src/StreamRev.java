import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamRev {

    public static void main(String[] args) {

        String str="Saurabh";

        String reverse= IntStream.range(0,str.length()).mapToObj(i->str.charAt(str.length()-1-i)).map(String::valueOf).collect(Collectors.joining());
       // System.out.print(reverse);

        Map<Character,Long> charCount=str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        charCount.entrySet().stream().forEach(entry->System.out.print(entry.getKey()+" "+entry.getValue()));



    }
}


