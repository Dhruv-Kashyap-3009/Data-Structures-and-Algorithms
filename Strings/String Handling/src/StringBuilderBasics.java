//Why use String Builder?
//Strings are Immutable and string builder are immutable.

import java.util.*;
class StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");           //Initializing a string builder
//        str.append(" World");      //Used for adding two strings
//        System.out.println(str);

//        str.setCharAt(0,'M');       //Sets a character in a string
//        System.out.println(str);

//        str.insert(2,'y');          //Insert a character in a string
//        System.out.println(str);
//        str.deleteCharAt(2);        //Delete a character in a string
//        System.out.println(str);

//        str.reverse();                //Reverse a string
//        System.out.println(str);

//        str.delete(2,4);              //Delete a certain part of string
//        System.out.println(str);

//        System.out.println(str.indexOf("l"));
//        System.out.println(str.lastIndexOf("l"));

//        System.out.println(str.substring(3));

        //toUppercase, tolowercase, startswith, endswith functions are not present in String Builder.
    }
}