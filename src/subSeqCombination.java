import java.util.ArrayList;

public class subSeqCombination {
    public static void main(String[] args) {
        //Subseq("","abc");
        System.out.println(SubseqWithArraylist("","abc"));
    }

    public static void Subseq(String p ,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Subseq(p+ch,up.substring(1));
        Subseq(p,up.substring(1));
    }

    public static ArrayList<String> SubseqWithArraylist(String p ,String up){
        ArrayList<String> Leftstr = new ArrayList<>();
        ArrayList<String> rightstr = new ArrayList<>();
        if(up.isEmpty()){
            ArrayList<String> ans= new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        Leftstr = SubseqWithArraylist(p+ch,up.substring(1));
        rightstr = SubseqWithArraylist(p,up.substring(1));
        Leftstr.addAll(rightstr);
        return Leftstr;
    }
}