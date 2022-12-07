import java.util.*;
public class A_Beautiful_Matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans= 0;
       // int[][] array = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int x= sc.nextInt();
                if( x ==1){
                    ans= ans + Math.abs(i-2);
                    ans = ans + Math.abs(j-2);
                }

            }
        }
        System.out.println(ans);
    }


}