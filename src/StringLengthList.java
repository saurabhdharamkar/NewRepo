import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringLengthList {

    public static void main(String[] args) {
        List<String> strList=List.of("bnvh","jkl","uy","jkgiuy","yrt","pfofugg");
        Map<String,Integer> map=new LinkedHashMap<>();
        for(String str:strList){
            map.put(str,str.length());
        }
       System.out.println(map);
    }
}
