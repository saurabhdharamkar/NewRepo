import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> result=intList.stream().filter(PrimeNumber::checkPrime).collect(Collectors.toList());
        System.out.println(result);
    }

    public static boolean checkPrime(int num){

        if(num<1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
