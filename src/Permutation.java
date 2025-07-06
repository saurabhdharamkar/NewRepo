public class Permutation {

    public static void main(String[] args) {

        String str="XYZ";
        int length=str.length();
        char [] ch=str.toCharArray();

        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(ch[i] !=ch[j]){
                    System.out.print(ch[i]+""+ch[j]+" ");
                }
            }
        }
    }
}
