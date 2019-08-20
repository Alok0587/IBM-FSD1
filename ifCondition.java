
public class ifCondition {

	public static void main(String[] args) {
int first=Integer.parseInt(args[0]);
int second=Integer.parseInt(args[1]);

int third=Integer.parseInt(args[2]);
int count=0;
int sum=first+second+third;
if(first>=40)
{
	count++;
}
if(second>=40)
{
	count++;
}

if(third>=40)
{
	count++;
	}
if(sum>=125)
{
	count++;
}
if(count==4)
{
	System.out.println("Passing");
}
if(count!=4)
	System.out.println("Failing");
	}

}
