import java.util.Scanner;

public class A_Anton_and_Danik {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      // scan.nextLine();
        String b = scan.next();
        int a=0,d=0;
        for(int i =0; i<n;i++){
            if(b.charAt(i)== 'D')
                d++;
            else
                a++;
        }
        if(a>d)
            System.out.println("Anton");
        else if(d>a)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    } 
}