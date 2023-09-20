
public class Fib {
 public static void main(String[] args) {
	 //declare a
	int a=0;
	//declare b
	int b=1;
	//declare c
	int c;
	//int count=15;
	//print a and b
	System.out.print( " "  + a);
	System.out.print(" "+b);
	//iterate values from 1 to 11
	for(int i=1;i<=15;i++) {
		//add a abd b to get c
		c=a+b;
		//print c
		System.out.print( " " +c);
		//swap a and b
		a=b;
		//swap b and c
		b=c;
	}
}

}
