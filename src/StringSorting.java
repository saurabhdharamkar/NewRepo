import java.util.ArrayList;
import java.util.List;

public class StringSorting {

    public static void main(String[] args) {

        List<String> intList=List.of("saurabh","raj","deepak","ganesh","amit");
        List<String> result=new ArrayList<>();
        for(int i=0;i<intList.size();i++){


            for(int j=i+1;j< intList.size();j++){
                if(intList.get(i).length()<intList.get(j).length()){
                    result.add(result.get(i));
                    break;
                }
            }

            result.forEach(System.out::println);
        }
    }
}
