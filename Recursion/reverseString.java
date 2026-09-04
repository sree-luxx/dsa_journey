import java.util.*;

class reverseString{
    public static void main(String[] args){
        String s="sree lakshmi";

        String rev=reverseStr(s);
        System.out.print(rev);
    }

    public static String reverseStr(String s){

        if(s ==""){
            return "";
        }
        return reverseStr(s.substring(1))+s.charAt(0);
    }
}