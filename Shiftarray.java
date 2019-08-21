import java.util.Scanner;
public class Shiftarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter six array elemnt:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		//shifting
		int temp=arr[size-1];
		for(int i=size-1;i>=1;i--)
		{
			arr[i]=arr[(i-1)%(size-1)];
		}
		arr[0]=temp;
		System.out.println("shifted array elements :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
