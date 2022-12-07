import java.util.*;
public class A_Watermelon{
public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int a = sc.nextInt();
    //System.out.println("enter the number of kilos of watermelon");
    if(a%2==0 && a!=2){
        System.out.println("YES");

    }
    else if(a==2){
        System.out.println("NO");
    }
    else{
        System.out.println("NO");
    }
}
}