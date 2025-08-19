import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dup {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,5,9,1,5,8,6,5,8,6,4,7,3,2);
        int length=intList.size();

        Map<Integer,Integer> result=new LinkedHashMap<>();

        for(int i=0;i<length;i++){

            result.put(intList.get(i),result.getOrDefault(intList.get(i),0)+1);
        }

        for(Map.Entry<Integer,Integer> finalResult:result.entrySet()){

            if(finalResult.getValue()==1){
                System.out.print(finalResult.getKey()+" ");
            }
        }
    }
}
