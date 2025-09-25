import java.util.*;
class NumericKeypadQuestion{
     static void Combination(String dig,String[] kp, String res){
         if(dig.length()==0){
             System.out.print(res+" ");
             return;
         }
         int currNum=dig.charAt(0) - '0';
         String currChoices = kp[currNum];

         for (int i = 0; i < currChoices.length(); i++) {
             Combination(dig.substring(1),kp, res + currChoices.charAt(i));
         }
     }
    public static void main(String[] args) {
        String dig ="253";
        String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        Combination(dig,kp,"");
    }
}