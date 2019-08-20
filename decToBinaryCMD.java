
public class decToBinaryCMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num=Integer.parseInt(args[0]);
		 String st="";
		 while(num>0)
		 {
			 int x=num%2;
			 st=x+st;
			 
			 num=num/2;
		 }
		 System.out.println(st);
		 
	}

}
