import java.util.ArrayList;
import java.util.List;

public class Seperator {

    public static void main(String[] args) {

        List<Integer> input=List.of(1,0,5,0,6,7,0,9,8,0,7,4,0,0);

        List<Integer> zeroes=new ArrayList<>();
        List<Integer> nonZeroes=new ArrayList<>();
        List<Integer> result=new ArrayList<>();

        for(int num:input){
            if(num==0){
                zeroes.add(num);
            }
        }
        for(int num:input){
            if(num!=0){
                nonZeroes.add(num);
            }
        }
        result.addAll(zeroes);
        result.addAll(nonZeroes);
        System.out.print(result);
    }
}
