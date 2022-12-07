import java.util.*;
import java.lang.*;
import java.io.*;

public class just1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//String s = sc.next();

		// Counters
		int counter = 0;
		//char last = s.charAt(0);
		for(int i=0;i<m;i++){
		//if((s.charAt(i))==s.charAt(i+1))
		if(n%10==0){
			n=n/10;
		}
		else{
			n = n-1;
		}

	     System.out.println(n ) ;
		
	}	
	}}