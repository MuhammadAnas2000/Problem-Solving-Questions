public class RecurrsionPearls {
    public static void main(String[] args) {
       System.out.println( stringPattern(1,4));
    }

    public static String stringPattern(int a,int b){

        String ans="";
        if(a==b){
            return String.valueOf(a);
        }
        ans+=a;
        String ans2 = stringPattern(a+1,b);
        ans+=ans2;
        ans = ans+a;
        return ans;
    }
}
