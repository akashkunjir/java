package assign5;
public class ArraySum {
	public static void ColSum(int a[][])
	{
		//Compute column-wise sum
		 System.out.println("Column Sum: y[] ");
		int y[]= {0,0,0};
        for (int i = 0; i < 3; i++) {
            int cSum = 0;
            for (int j = 0; j < 3; j++) {
                cSum += a[j][i];
                y[i] = cSum;
            if(j==2)
            {System.out.print(cSum+" ");}
          }
        }
	}
	public static void RowSum(int b[][])
	{
      //Compute row-wise and sum of all elements
		 System.out.println("\nRow Sum: x[] ");
        int sum = 0, x[] = {0,0,0};
        for (int i = 0; i < 3; i++) {
            int rSum = 0;
            for (int j = 0; j < 3; j++) {
                sum += b[i][j];
                rSum += b[i][j]; 
                x[i] = rSum;
            }
            System.out.println(rSum+" ");
        } 
	}
	public static void main(String[] args) {
	
		int A [][] = {
				{1,4,7},
				{2,5,8},
				{3,6,9}
				};
		System.out.println("For 3x3 Matrix: A[][] ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println(" ");
		}
		ColSum(A);
		RowSum(A);
		
	}

}
