
public class fibanocciCMD {

	public static void main(String[] args) {
		//fib 1-89
		int prev=1;
		int next=1;
		
		while(next<=89)
		{
		System.out.println(prev);
		int temp=prev;
		prev=next;
		next=next+temp;		
		}

	}

}
