import java.util.*;

class PrintPermutations{
    public static void PrintPerm(String str, String Permutation){
        if(str.isEmpty()){
            System.out.println(Permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            PrintPerm(newStr, Permutation+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        System.out.println("All Permutations are: ");
        PrintPerm(str, "");
    }
}