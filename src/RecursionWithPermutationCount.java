public class RecursionWithPermutationCount {

    public static void main(String[] args) {
        System.out.print(permutations("", "abcd"));
    }

    public static int permutations(String process, String unProcess) {

        if (unProcess.isEmpty()) {
            return 1;
        }

        char ch = unProcess.charAt(0);
        int count =0;
        for (int i = 0; i <= process.length(); i++) {
            String s = process.substring(0, i);
            String end = process.substring(i, process.length());
           count+= permutations(s + ch + end, unProcess.substring(1));

        }
        return count;
    }
}