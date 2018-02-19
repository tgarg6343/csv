import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
public static void main(String[] args) {
	
	
	String query="select avg(win_by_wickets),min(win_by_runs) from ipl.csv";
/*
	Pattern pattern=Pattern.compile("\\s+");
	Matcher matcher=pattern.matcher(query);
	String modQuery=matcher.replaceAll(" ").trim();
	
	
	
	String[] words=modQuery.split(" ");
	for(String word:words) {
		System.out.println(word);
	}
	
	
	
	String x="where";
	String basePart=modQuery.substring(0,modQuery.indexOf(x)-1);
	String filterPart=modQuery.substring(modQuery.indexOf(x)+x.length()+1);
	
	System.out.println("Base part is:"+basePart);
	System.out.println("filtered part is:"+filterPart);
	
	List<String> logicalOp=new ArrayList<String>();
	List<String> conditions=new ArrayList<String>();
	
	String filteredWords[]=filterPart.split(" ");
	int previous=0;
	String condition="";
	for(int i=0;i<filteredWords.length;i++) {
		if(filteredWords[i].equalsIgnoreCase("and")||filteredWords[i].equalsIgnoreCase("or")||filteredWords[i].equalsIgnoreCase("not")) {
			logicalOp.add(filteredWords[i]);
			for(int j=previous;j<i;j++) {
				condition+=filteredWords[j]+" ";
			}
			conditions.add(condition.trim());
			condition="";
			previous=i+1;
		}
	}condition="";
	
	
	for(int j=previous;j<filteredWords.length;j++) {
		condition+=filteredWords[j]+" ";
	}
	conditions.add(condition.trim());
	
	
	
	
	System.out.println(logicalOp);
	System.out.println(conditions);
	
	System.out.println("");
	
	
	Pattern pattern1=Pattern.compile("group by ([\\w]+)");
	Matcher matcher1=pattern1.matcher(modQuery);
	String groupBy="";
	if(matcher1.find()) {
		groupBy=modQuery.substring(matcher1.start(),matcher1.end());
	}
  System.out.println(groupBy);
  
  
  Pattern pattern2=Pattern.compile("order by ([\\w]+)");
	Matcher matcher2=pattern2.matcher(modQuery);
	String orderBy="";
	if(matcher2.find()) {
		orderBy=modQuery.substring(matcher2.start(),matcher2.end());
	}
System.out.println(orderBy);

List<String> displayFields=new ArrayList<String>();
List<String> aggregrateFields=new ArrayList<String>();
String[] fields=basePart.split(" ");
boolean selectAll=false;
if(fields.length==2&&fields[1].equals("*")) {
	selectAll=true;
}
for(String field: fields) {
	if(field.equalsIgnoreCase("select"))
		continue;
	else if(field.equalsIgnoreCase("from"))
		break;
	else {
		displayFields.add(field);
		if(field.startsWith("avg")||field.startsWith("min")||field.startsWith("max")||field.startsWith("count")||field.startsWith("sum")) {
			aggregrateFields.add(field);
		}
	}
}
System.out.println(displayFields);
*/
	


QueryDetails q=new QueryDetails(query);
System.out.println(q);





}
}
