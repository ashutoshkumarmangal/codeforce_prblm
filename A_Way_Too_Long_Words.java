import java.util.*;
import java.io.*;
public class A_Way_Too_Long_Words{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
        String a = sc.nextLine();
        //char f = a.charAt(0);
        //char g = a.charAt(a.length()-1);
        int b = a.length();
        if(b <= 10){
            System.out.println(a);
        }
        else{
            System.out.println(""+a.charAt(0)+(b-2)+a.charAt(b-1));
        }
        

    }
}}