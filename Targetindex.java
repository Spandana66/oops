import java.util.Scanner;
class Targetindex

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the target number");
		int target=sc.nextInt();
		int a[]={11,8,9,7,2,-3};
		int b[]=new int[3];
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[k]==target)
					{
						b[0]=i;
						b[1]=j;
						b[2]=k;
						System.out.println("Indices:"+b[0]+"and"+b[1]+"and"+b[2]);
						return;
					}
				}
			}
	}
}
}
