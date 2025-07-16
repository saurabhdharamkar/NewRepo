import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        List<Integer> intList=List.of(3,5,49,86,8,21,2,98,4,58,7,46);

        List<Integer> firstHalf=intList.subList(0,intList.size()/2).stream().sorted().toList();
        List<Integer> secondHalf=intList.subList(intList.size()/2,intList.size()).stream().sorted(Comparator.reverseOrder()).toList();

        List<Integer> result=new ArrayList<>();
        result.addAll(firstHalf);
        result.addAll(secondHalf);

        for(int num:result){
            System.out.print(num+",");
        }
    }
}
