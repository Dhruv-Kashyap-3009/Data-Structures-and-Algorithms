import java.util.*;
class StoreAllSubsequenceInArrayList {
    static ArrayList<String> PrintSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0) {
            ans.add(" ");
            return ans;
        }
        char c=s.charAt(0);
        for(String ss: PrintSSQ(s.substring(1))){
            ans.add(ss);
            ans.add(c+ss);              //Self Work
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter String: ");
        s=sc.nextLine();
        System.out.println("All Subsequences are: ");
        System.out.println(PrintSSQ(s));
    }
}