import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListDuplicate {

    public static void main(String[] args) {

        List<Integer> intList=List.of(2,3,45,6,4,5,6,3);

        Map<Integer,Long> mapList=intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Integer> result=mapList.entrySet().stream().filter(ele->ele.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.print(result);
    }
}
