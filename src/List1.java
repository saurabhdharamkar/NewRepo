import java.util.List;
import java.util.stream.Collectors;

public class List1 {

    public static void main(String[] args) {

        List<Integer> intList=List.of(2,3,4,5,6,7,8,9);

        List<Integer> result;

        result=intList.stream().skip(2).limit(2).collect(Collectors.toList());
        System.out.print(result);


    }
}
