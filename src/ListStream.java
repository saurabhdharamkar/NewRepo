import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListStream {

    public static void main(String[] args) {

        List<Integer> intList=List.of(2,3,4,5,6,4,8,9,8);

       Map<Integer,Long> mp= intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       List<Integer> resu;
       resu=mp.entrySet().stream().filter(ele->ele.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
       System.out.print(resu);

       List<Integer> ascending;

        ascending=intList.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        System.out.print(ascending);
    }
}
