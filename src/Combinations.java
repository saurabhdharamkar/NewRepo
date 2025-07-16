public class Combinations {

    public static void main(String[] args) {

        String str="XYZ";

        char [] ch=str.toCharArray();
        int length=str.length();

        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(ch[i] !=ch[j]){
                    System.out.print(ch[i]+""+ch[j]+" ");
                }
            }
        }
    }
}
