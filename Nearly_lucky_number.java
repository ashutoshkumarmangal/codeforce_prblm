import java.util.Scanner;
public class Nearly_lucky_number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    int count = 0;
    while(a!=0){
        if(a%10==4||a%10==7){
            count=count+1;
        }
        a=a/10;
    }
    if(count == 4||count==7){
        System.out.println("YES");

    }
    else {
        System.out.println("NO");
    }
    //return 0;
  }  
}
