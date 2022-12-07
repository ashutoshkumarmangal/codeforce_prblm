import java.util.*;
public class A_Wrong_Subtraction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int ti = sc.nextInt();
        //int b = a;
        for(int i=1; i<=ti; i++){
            if(n%10==0){
                n=n/10;
            }
            else{
                n = n-1;
            }
    
           // System.out.println(n ) ;
        }
        System.out.println(n ) ;
    }
}