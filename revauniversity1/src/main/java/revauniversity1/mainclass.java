package revauniversity1;
import java.util.*;
public class mainclass {
	void main() {
		Scanner in=new Scanner(System.in);
		String st;
		int k,g;
		int[] a=new int[k];
		System.out.println("Enter a string");
		st=in.nextLine();
		System.out.println("Enter a number");
		k=in.nextInt();
		System.out.println("Enter a number");
		g=in.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<k;i++)
			a[i]=in.nextInt();
		mainclass obj=new mainclass();
		obj.App(k);
		obj.palin(st);
		obj.bubble(k);
		obj.fib(k);
		for(int i=0;i<k;i++)
			obj.search(k,a[],g);
	}
}
