import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveRepeatingCharacter {

    public static void main(String[] args) {
        String str="tree";

        int length=str.length();
        char [] ch=str.toCharArray();

        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=length-1;i>=0;i--){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        for(Map.Entry<Character, Integer> result:map.entrySet()){

                System.out.print(result.getKey());

        }
    }
}
