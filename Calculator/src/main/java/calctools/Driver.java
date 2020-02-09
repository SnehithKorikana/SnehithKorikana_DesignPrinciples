package calctools;

import calctools.Add;
import calctools.Subtract;
import calctools.Multiply;
import calctools.Division;
import java.util.*;
public class Driver {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int x,y,ans=0;
	char op;
		x=sc.nextInt();
		y=sc.nextInt();
		op=sc.next().charAt(0);
	switch (op) { 
    case '+': 
    	Add a=new Add();
        ans = (int) a.operation(x,y);
        System.out.println(ans);
        break; 
    case '-': 
    	Subtract s=new Subtract();
        ans = (int) s.operation(x,y);
        System.out.println(ans);
        break; 
    case '*': 
    	Multiply m=new Multiply();
        ans = (int) m.operation(x,y);
        System.out.println(ans);
        break; 
    case '/': 
    	Division d=new Division();
        ans = (int) d.operation(x,y); 
        System.out.println(ans);
        break;  
    default: 
    	System.out.println("Invalid operation");  
    }
sc.close();
}
}
