package Inheritance;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Num=10,count=0;
int temp=Num;
for(int i=1;i<=Num;i++)
{
	if(Num%i==0)
		count++;
}
	if(count==2)
	{
		System.out.println(Num+" no is pn");
	}
	else
	{
		System.out.println(Num+" no is not a pn");
	}
}
}
