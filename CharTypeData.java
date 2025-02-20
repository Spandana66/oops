import java.util.Scanner;
class CharTypeData 
{
    public static void main(String[] args) 
 {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of sub arrays:");
        int x = sc.nextInt();
        System.out.println("Enter the no of Elements to store:");
        int y = sc.nextInt();
        char a[][] = new char[x][y];
        for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
			System.out.println("Enter the"+(i+1)+"array"+(j+1)+"Value");
			char value=sc.next().charAt(0);
			  a[i][j]=value;
			}
		}
	//***************************************************************

		System.out.println("*****************************/n********");
		 for(int i=0;i<=(a.length)-1;i++)
		{
			 System.out.print("{");
			 
				 
			for(int j=0;j<=(a[i].length)-1;j++)
			{
				System.out.print(a[i][j]+",");
			}
			System.out.println("}");
		}
	}
		 //*******************************************************************
	}