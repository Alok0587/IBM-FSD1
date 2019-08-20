import java.util.*;
public class factorialCMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int fact=1;
       for(int i=1;i<=num;i++)
       {
    	   fact=fact*i;
       }
       System.out.print("factorial is:"+fact);
	}

}
