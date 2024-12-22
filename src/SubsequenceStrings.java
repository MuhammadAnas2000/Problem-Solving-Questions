public class SubsequenceStrings {
    public static void main(String[] args) {
        String s = "ancdaefga";
        //skipA("",s);
        System.out.println(skipAWithOneParam(s));
    }

    public static void skipA(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            skipA(ans,str.substring(1));
        }else{
            skipA(ans+ch,str.substring(1));
        }
    }

    public static String skipAWithOneParam(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skipAWithOneParam(str.substring(1));
        }else{
            return ch+skipAWithOneParam(str.substring(1));
        }
    }
}
