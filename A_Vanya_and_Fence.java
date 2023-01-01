import java.util.*;
public class A_Vanya_and_Fence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int h = sc.nextInt();
        int arr[] = new int[n];
       // int i = 0;
        int count =0;
        //while(i<n){
            for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
           // i++;
        }
        //System.out.println(arr[i]);
        //if(a[i]>h)
        for (int i=0;i<n;i++){
            if(arr[i]>h){
                count=count+2;}
             else
             {
                count=count+1;
             }   
            
        }
        System.out.println(count);

    }
}