import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
List<Object> MyList=new ArrayList<Object>();
MyList.add("Welcome  to arraylist concept");
MyList.add(1, 12);
MyList.add(" sfjbs ");
MyList.add(0, 22);
System.out.println(MyList.size());
MyList.clear();
for(Object aa:MyList)
{
	System.out.println(aa);
}
System.out.println(MyList.size());

	}

}
