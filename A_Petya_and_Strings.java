//compareTo() is used for comparing two strings lexicographically. Each character of both strings are converted into a Unicode value. However, if both the strings are equal, then this method returns 0 else it only result either negative or positive value
import java.util.*;
public class A_Petya_and_Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        //String first = first1.toLowerCase(); convert to lowercase in java
        String a1= a.toLowerCase();
        String a2 = b.toLowerCase();

        if(a1.compareTo(a2)==0)
            System.out.println("0");
        
        if(a1.compareTo(a2)>0)
            System.out.println("1");

        if(a1.compareTo(a2)<0)
             System.out.println("-1");
        
        }
    }
