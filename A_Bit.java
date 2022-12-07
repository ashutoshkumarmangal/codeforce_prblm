import java.util.*;
public class A_Bit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int x = 0;
        String b = "X++";
        String c = "++X";
        String[] str = new String[a];
        for(int i = 0; i<a;i++){
             String y = sc.next();
             str[i]=y;
        }
        
        for(int i=0;i<a;i++){
            if(str[i].equals(b) || str[i].equals(c))
            x++;
            else
            x--;
        }
        System.out.println(x);

        }
    }
