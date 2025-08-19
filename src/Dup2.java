import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dup2 {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,5,9,1,5,8,6,5,8,6,4,7,3,2);

        List<Integer> duplicate=intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).map(Map.Entry::getKey).toList();
        System.out.println(duplicate);
    }
}
