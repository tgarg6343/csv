import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<String, Integer>();
	String query="select * from ipl.csv where season > 2014 and city = 'Bangalore'";
	String words[]=query.split(" ");
	for(String word: words) {
		System.out.println(word);
	}

String basePart="";
String filterPart="";
int flag=0;
for(String word: words) {
	if(word.equalsIgnoreCase("where"))
	{
	flag=1;
	continue;
	}
	if(flag==0)
	basePart+=word+" ";
	else {
		filterPart+=word+" ";
	}
		
}

System.out.println("before where is:"+basePart);
System.out.println("after  where is:"+filterPart);

ArrayList<String> list =new ArrayList<String>();

String afterWhere[]=filterPart.split(" ");
String condition="";
int next=0;
for(int i=0;i<afterWhere.length;i++) {
	
	if(afterWhere[i].equalsIgnoreCase("and")||afterWhere[i].equalsIgnoreCase("or")) {
		if(!map.containsKey("and")&&afterWhere[i].equalsIgnoreCase("and")) {
			map.put("and",1);
		}
		else {
			map.put("and",map.get("and")+1);
		}
		if(!map.containsKey("or")&&afterWhere[i].equalsIgnoreCase("or")) {
			map.put("or",1);
		}
		else {
			map.put("or",map.get("or")+1);
		}
		condition="";
		
		for(int j=next;j<i;j++) {
			condition+=afterWhere[j]+" ";
		}
		list.add(condition);
			next=i;
	}
}
Set<String> keys=map.keySet();
Iterator<String> iterator=keys.iterator();
while(iterator.hasNext()) {
	String key=(String)iterator.next();
	System.out.println(key+" "+map.get(key));
}
condition="";
for(int j=next+1;j<afterWhere.length;j++) {
	condition+=afterWhere[j]+" ";
}
list.add(condition);

System.out.println(list);

}
}


