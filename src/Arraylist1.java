import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
ArrayList mylist=new ArrayList();
mylist.add(" Hello  ");
mylist.add(1);
mylist.add(null);
int size=mylist.size();
System.out.println(size);
mylist.clear();

for(Object arr:mylist)
{
	System.out.println(arr);
}
Object e=mylist.get(1);
System.out.println(e+"       the value of e       is :");
System.out.println(mylist.remove(1));

for(Object arr:mylist)
{
	System.out.println(arr+" the elements in array  list ");
}
mylist.add(1, " welcome ");
mylist.add(2,"  udgq ");
mylist.add(0, "bat  ");
mylist.clear();
for(Object arr:mylist)
{
	System.out.println(arr+" the elements in array  list ");
}


	}

}
