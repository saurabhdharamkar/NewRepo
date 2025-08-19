import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringRev {

    public static void main(String[] args) {

        String str="avbavsdgsdsfsjygts";

        //String dup=str.chars().mapToObj(ele->(char)ele).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(String::valueOf).collect(Collectors.joining());
        //System.out.println(dup);

        Set<Character> seen=new LinkedHashSet<>();

        Set<Character> dup=new LinkedHashSet<>();

        char [] ch=str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(!seen.add(ch[i])){
                dup.add(ch[i]);
            }
        }

        System.out.println(dup);
    }
}
