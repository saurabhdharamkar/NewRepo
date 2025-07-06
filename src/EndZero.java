import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EndZero {

    public static void main(String[] args) {

        List<Integer> intList=List.of(2,0,5,0,4,0,9,0,7);

        LinkedList<Integer> zeros=new LinkedList<>();
        LinkedList<Integer> others=new LinkedList<>();
        LinkedList<Integer> result=new LinkedList<>();

        for(int num:intList){
            if(num!=0){
                others.add(num);

            }else{
                zeros.add(num) ;

            }
        }
       List<Integer> sorted= others.stream().sorted().toList();
        result.addAll(sorted);
         result.addAll(zeros);



       result.forEach(ele->System.out.print(ele+" "));
       System.out.println();


        }

    }

