import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");

		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		//bubble logic
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}			
		}
		System.out.println("Sorted elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
