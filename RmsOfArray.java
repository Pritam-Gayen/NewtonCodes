import java.io.*; // for handling sc/output
import java.util.*; // contains Collections framework
import java.lang.Math;
// don't change the name of this class
// you can add inner classes if needed
class Main 
{
	static double rmsValue(int arr[], int n)
	{
		long square = 0;
		double mean = 0.0f;
		double root = 0.0f;
		for(int i = 0; i < n; i++)
			square += Math.pow(arr[i], 2);
		
		mean = (square / (double) (n));
	
		root = (double)Math.sqrt(mean);
	
		return root;
	}
	public static void main (String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		System.out.println(String.format("%.6f", rmsValue(arr, N)));
	}	
}