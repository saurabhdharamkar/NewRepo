import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String[] args) {

        List<Integer> intList=List.of(3,5,49,86,8,21,2,98,4,58,7,46,86,8,98,2);

        int length=intList.size();

        Map<Integer,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<length;i++){

            map.put(intList.get(i),map.getOrDefault(intList.get(i),0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer,Integer> result: map.entrySet()){
            if(result.getValue()>1){
                list.add(result.getKey());
            }
        }
        System.out.print(list);
    }
}
