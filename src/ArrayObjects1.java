
public class ArrayObjects1 {

	public static void main(String[] args) {
Object a[]= {1,"Welcome",3583};
Object b[]= {1,"Welcome",3583};
/* a[0]=1;
a[1]=2.5;
a[2]="Welcome";
a[3]='c';
a[4]=2.07235253; */
for(Object i:a)
{
	System.out.println(i);
}
System.out.println(a.equals(a));
	}

}
