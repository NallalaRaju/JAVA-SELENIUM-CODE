import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// Adding  Data pairs  into Hash Map 
HashMap hm=new HashMap(); 
hm.put(101, " Raju  ");
hm.put(102, "  abcd  ");
hm.put(104, " def  ");
// The size(),get()--to get the value associated with the  key
System.out.println(hm.size()+"\n"+hm+"\n"+hm.get(102));
//To  remove the pair
hm.remove(102);
System.out.println(hm.size()+"\n"+hm+"\n");
//Method to   get no of  keys
Object  Keys=hm.keySet();
System.out.println(Keys);

for(Object  Key:hm.keySet())
{
	System.out.println(Key+" "+hm.get(Key));
}

	}

}
