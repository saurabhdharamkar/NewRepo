import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class ListAggregation {

    public static void main(String[] args) {

        List<Integer> integerList=List.of(1,5,8,9,6,3,4,7,8,9);

        int maxNum=integerList.stream().mapToInt(Integer::intValue).max().orElse(Integer.MAX_VALUE);
        System.out.print(maxNum);

        int minNum=integerList.stream().mapToInt(Integer::intValue).min().orElse(Integer.MIN_VALUE);
        System.out.print(minNum);

        long count=integerList.stream().mapToInt(Integer::intValue).count();

        System.out.print("count :"+count);



    }
}
