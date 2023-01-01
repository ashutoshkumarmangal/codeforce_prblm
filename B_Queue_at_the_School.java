import java.util.*;
import java.io.*;
public class B_Queue_at_the_School{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int nostr=sc.nextInt();
        int noswt=sc.nextInt();
        String os = sc.next();
        char[] c = os.toCharArray();
        //int j;
        //boolean b;
        for(int j=0;j<noswt;j++){
            //while( j<= noswt){
            for(int i=1;i<os.length();i++){
                if(c[i-1]=='B'&&c[i]=='G'){
                    char temp=c[i-1];
                    c[i-1]=c[i];
                    c[i]=temp;
                    i++;
                   
                }
            }
        }
        //String swapp=new String(c);
        //System.out.println(swapp);
        for(int i=0;i<c.length;i++)
	        {
	        	System.out.print(c[i]);
        
        
      }
            
    }}

