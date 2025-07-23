import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharsTest {

    public static void main(String[] args) {

        String str="saurabhsarb";
        int length=str.length();
        char [] ch=str.toCharArray();
        Map<Character,Long> map=new LinkedHashMap<>();
        for(int i=0;i<length;i++){
            map.put(ch[i],map.getOrDefault(ch[i], 0L)+1);
        }
        for (Map.Entry<Character,Long> result:map.entrySet()){
            if(result.getValue()==1){
                System.out.println(result.getKey());
            }
        }
    }
}
