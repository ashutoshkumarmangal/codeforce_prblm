import java.util.*;
public class A_Team{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0;
        for(int a = 1; a <=n; a++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int sum = 0;
            sum = sum + b+c+d;
            if(sum >=2 ){
                j= j+1;
            }

        }
        System.out.println(j);

    }
}