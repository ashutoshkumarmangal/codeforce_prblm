import java.util.*;
public class new1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String c= sc.next();
       // char ch[]=a.toCharArray();
        String b="";
        for(int i=0;i<a.length();i++){
           //b=b+ch[i];

        char ch = a.charAt(i);
        b=ch+b;
            

        System.out.println(b);
        }
        if(c.equals(b))
        System.out.println("YES");
        else{
            System.out.println("NO");
        }
        
    }
}