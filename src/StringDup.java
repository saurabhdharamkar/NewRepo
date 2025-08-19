import java.util.LinkedHashMap;
import java.util.Map;

public class StringDup {

    public static void main(String[] args) {

        String str="SaurabhS";
        char [] ch=str.toCharArray();
        int length=str.length();

        Map<Character,Integer> result=new LinkedHashMap<>();

        for(int i=0;i<length;i++){
            result.put(ch[i],result.getOrDefault(ch[i],0)+1);
        }

        for(Map.Entry<Character,Integer> finalResult: result.entrySet()){
            if(finalResult.getValue()>1){
                System.out.print(finalResult.getKey());
            }
        }
    }
}
