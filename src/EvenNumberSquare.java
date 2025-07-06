import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberSquare {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> result=intList.stream().filter(num->num%2==0).map(num->num*num).collect(Collectors.toList());
        System.out.println(result);
    }
}
