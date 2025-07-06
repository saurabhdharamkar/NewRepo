import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Elements {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> sort=intList.stream().sorted().toList();
        System.out.println(sort);

        List<Integer> reverse=intList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reverse);

        Optional<Integer> secondLarge=intList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondLarge.get());

        int sum=intList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        OptionalInt min=intList.stream().mapToInt(Integer::intValue).min();
    }
}
