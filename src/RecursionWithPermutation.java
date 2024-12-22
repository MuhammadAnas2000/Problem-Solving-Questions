import java.util.ArrayList;

public class RecursionWithPermutation {
    public static void main(String[] args) {
       // permutations("","abc");
       System.out.print(permutationsWithArrayList("","abcd"));
    }

    public static void permutations(String process, String unProcess){

            if(unProcess.isEmpty()){
                System.out.println(process);
                return;
            }

            char ch = unProcess.charAt(0);
            for(int i=0 ;i<=process.length();i++){
                String s =process.substring(0,i);
                String end = process.substring(i,process.length());
                permutations(s+ch+end,unProcess.substring(1));
            }
    }

    public static ArrayList<String> permutationsWithArrayList(String process, String unProcess){

        if(unProcess.isEmpty()){
            ArrayList<String> finaAns = new ArrayList<>();
            finaAns.add(process);
            return finaAns;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = unProcess.charAt(0);
        for(int i=0 ;i<=process.length();i++){
            String s =process.substring(0,i);
            String end = process.substring(i,process.length());
           ans.addAll(permutationsWithArrayList(s+ch+end,unProcess.substring(1)));
        }
        return ans;
    }
}
