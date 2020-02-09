package calctools;
import calctools.Mytools;
public class Division implements Mytools{

	public double operation(int x,int y){
	if(y!=0) {
	return x/y;
}
	else {
		System.out.println("Divided by zero throws this message");
		return x;
	}
}
}
