
public class countingTableCMD {

	public static void main(String[] args) {
	int tab=Integer.parseInt(args[0]);
	int lim=Integer.parseInt(args[1]);
	for(int i=1;i<=lim;i++)
	{
		System.out.println(tab+"*"+i+"="+(tab*i));
	}

	}

}
