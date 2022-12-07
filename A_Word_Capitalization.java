import java.util.*;
public class A_Word_Capitalization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a  = sc.next();
        char [] b = a.toCharArray();
        b[0]= Character.toUpperCase(b[0]);
        for(int i=0;i<a.length();i++){
          System.out.print(b[i]);
        }
        }
    }
