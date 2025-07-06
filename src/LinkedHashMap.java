import java.util.Map;

public class LinkedHashMap {

    public static void main(String[] args) {

        String str="ccggfhhtddc";

        int length=str.length();

        char [] ch=str.toCharArray();

        java.util.LinkedHashMap<Character,Integer> map=new java.util.LinkedHashMap<>();

        java.util.LinkedHashMap<Character,Integer> resultMap=new java.util.LinkedHashMap<>();

        for(int i=0;i<length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }

        for(Map.Entry<Character,Integer>result:map.entrySet()){
            if(result.getValue()>1) {
                resultMap.put(result.getKey(),result.getValue());
            }
        }

        for(Map.Entry<Character,Integer> results:resultMap.entrySet()){
            System.out.print(results.getKey()+""+results.getValue());
        }

    }
}
