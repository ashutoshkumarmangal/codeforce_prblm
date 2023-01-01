import java.util.*;
public class A_Translation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String c= sc.next();
        //char ch[]=a.toCharArray();
        String b="";
        for(int i=a.length()-1;i>=0;i--){
           b=b+a.charAt(i);
            

        }
        //System.out.println(b);
        if(c.equals(b))
        System.out.println("YES");
        else{
            System.out.println("NO");
        }
        
    }
}