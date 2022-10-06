package assing4;
public class DemoArray {
	public static int Max(int []a)
	{
		int max=a[0];		
		for(int i =0;i<5;i++)
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}
		return max;
	}
	public static int Min(int []a)
	{
		int min=a[0];
		
		for(int i =0;i<5;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
		}
		return min;
	}
	public static int Avg(int []a)
	{
		int avg=0;	
		for(int i =0;i<5;i++)
		{
			avg = avg+a[i];
		}	
		return avg/5;
	}
	public static void main(String[] args) {

		int arr[] = {10,20,69,46,35};	
		int mx = Max(arr);
		int mn = Min(arr);
		int av = Avg(arr);	
		System.out.println("Result: Max = "+mx+" Min = "+mn+" Average = "+av);
	}
}
