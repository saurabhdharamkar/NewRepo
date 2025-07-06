
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntSortAsc {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,2,3,445,8,7,52,6,8,2);

        List<Integer> result;

        result=intList.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        System.out.print(result);

    }
}
