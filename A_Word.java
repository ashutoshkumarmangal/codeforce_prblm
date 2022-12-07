import java.util.*;
public class A_Word{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int lowercase = 0;
        int uppercase = 0;
        for(int i=0; i<a.length();i++){
            char ch = a.charAt(i);
            if(ch >='A' && ch<='Z')
            uppercase++;
            if(ch >='a' && ch<='z')
            lowercase++;
            //System.out.println(lowercase+""+uppercase);

        }
        if(uppercase > lowercase){
            System.out.println(a.toUpperCase());
            //for(int i=0;i<a.length();i++){
             //   sc.setcharAt(i, Character.toUpperCase(a.charAt(i)));
            }
            else{
                System.out.println(a.toLowerCase());
            }
        }
        //System.out.println(lowercase+"    "+uppercase);
    }
