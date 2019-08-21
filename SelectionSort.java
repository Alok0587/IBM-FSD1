import java.util.Scanner;
public class SelectionSort {

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
		//selection sorting
		for(int i=0;i<size;i++)
		{
			int elem=arr[i];
			for(int j=i+1;j<size;j++)
			{
				if(elem>arr[j])
				{
					int temp=elem;
					elem=arr[j];
					arr[j]=temp;
				}
			}
			arr[i]=elem;
		}
		System.out.println("Sorted elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
