import java.util.*;
class PrintAllSubsequence{
    static void PrintSSQ(String s,String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }

        char curr=s.charAt(0);
        PrintSSQ(s.substring(1),currAns+curr);   //Character is Included
        PrintSSQ(s.substring(1),currAns);    //Character is not Included
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,currAns="";
        System.out.println("Enter String: ");
        s=sc.nextLine();
        System.out.println("All Subsequences are: ");
        PrintSSQ(s,currAns);
    }
}