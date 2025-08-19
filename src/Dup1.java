import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dup1 {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,5,9,1,5,8,6,5,8,6,4,7,3,2);
        ///  ///////////////////////////////

        Set<Integer> list=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();

        for(int num:intList){

            if(!list.add(num)){
                duplicate.add(num);
            }
        }

        System.out.print(duplicate);
    }
}
