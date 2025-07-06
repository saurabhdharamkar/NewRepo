public class StringReverse {

    public static void main(String[] args) {

        String str="Saurabh";
        int length=str.length();
        char [] ch=str.toCharArray();
        String reverse="";
        int count=0;

        for(int i=length-1;i>=0;i--){

            reverse+=ch[i];
            ++count;
        }
        System.out.println(reverse);
        System.out.println(count);

        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(ch[i]==ch[j]){
                    System.out.println(ch[i]);
                }
            }
        }

    }
}
