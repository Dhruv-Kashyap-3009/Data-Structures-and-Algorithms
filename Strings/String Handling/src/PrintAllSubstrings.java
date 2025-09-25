import java.util.*;
class PrintAllSubstrings{
    static void PrintSubstring(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a String: ");
        str=sc.nextLine();
        System.out.println("All Substrings are: ");
        PrintSubstring(str);
    }
}