import java.util.*;
public class A_Soldier_and_Bananas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_p = sc.nextInt();
        int money = sc.nextInt();
        int b = sc.nextInt();
        int c = first_p;
        //int bnmoney;
        for(int i =2;i<=b;i++){
           c = c + first_p * i;}

            if(c<=money){
               // rem = first_p - money;
                System.out.println(0);
                System.exit(0);
                
            }
            System.out.println(c-money);
        }

    }
