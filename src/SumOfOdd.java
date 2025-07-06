import java.util.List;

public class SumOfOdd {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,2,3,4,5,6,7,8,9);

        int result=intList.stream().filter(ele->ele%2==0).mapToInt(Integer::intValue).sum();

        System.out.println(result);

        int max=intList.stream().mapToInt(Integer::intValue).max().orElse(Integer.MAX_VALUE);
        System.out.println(max);

        int min=intList.stream().mapToInt(Integer::intValue).min().orElse(Integer.MIN_VALUE);
        System.out.println(min);
    }
}
