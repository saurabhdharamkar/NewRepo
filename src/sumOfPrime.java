import java.util.List;

public class sumOfPrime {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,2,3,4,5,6,7,8,9);

        int result=intList.stream().filter(sumOfPrime::primeCheck).mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }

    public static boolean primeCheck(int num){
        if(num<=1)
            return false;

        for(int i=2;i<num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
