public class Vowels {

    public static void main(String[] args) {

        String str="atesridodyfudgdt";
        char [] ch=str.toCharArray();
        int length=str.length();
        String result="";

        for(int i=0;i<length;i++){
            if(!(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')){
                result+=ch[i];
            }
        }

        System.out.print(result);
    }
}
