import java.util.*;
public class A_Next_Round{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int c = sc.nextInt();
       int passing = sc.nextInt();
       int[] array = new int[c];
       for(int i = 0 ; i< c ;i++){
        array[i] = sc.nextInt();
       } 
      
       int count = 0;
       
        for (int i = 0; i < c; i++) {
            if (array[i] >= array[passing-1] && array[i] > 0)
                count++;
            else
                break;

       }
       System.out.println(count);
       sc.close();
    }
}