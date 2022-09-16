import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RamGrades 
{
	public static void main (String[] args) 
	{
        Scanner input=new Scanner(System.in);
		int a,b,c,d;
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		System.out.println((a+b+c+d)/4);
	}
}