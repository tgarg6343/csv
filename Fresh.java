import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public class Fresh {
	public static void main(String[] args) {
		String data = "";
		String FILENAME="ipl.csv";
		Matches[] match=new Matches[577];
		String text="";
		String line1="";
		FileReader file=null;
		BufferedReader buffer=null;
		 try {
		    	file=new FileReader(FILENAME);
		    	buffer = new BufferedReader(file);
		    	String st;
		    	int x=0;
		    	while ((st = buffer.readLine()) != null) {
		    		if(x==0) {
		    			line1=st;
		    			x++;
		    		}else {
		    			match[x-1]=new Matches(st);
		    			text+=st+",";
		    			x++;
		    		}
		    	}
		    }	
		 catch (IOException e) {
				e.printStackTrace();
			}
		 finally {
				if(file!=null) {
					try {
						file.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(buffer!=null) {
					try {
						buffer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		// finding all the headers
		 String[] headers1=line1.split(",");
	/* Map<String,String> map=new LinkedHashMap<String,String>();
			for(String header1:headers1)
				{
				try {
					int x=Integer.parseInt(header1);
					map.put(header1, "Integer");
				}
				catch(NumberFormatException e){
					map.put(header1, "String");
				}
				}
		*/
		/*ArrayList<String> list=new ArrayList<String>();
		ArrayList<Integer> indexes=new ArrayList<Integer>();
		list.addAll(Arrays.asList(text.split(",")));
		Iterator<String> iterator1=list.iterator();
		int count=0;
		while(iterator1.hasNext()) {
			String word=(String)iterator1.next();
			if(word.startsWith(" "))
			indexes.add(count);	
			count++;
		}
		int count1=0;
		Iterator<Integer> it=indexes.iterator();
		while(it.hasNext()) {
			int index=(Integer)it.next();
			list.set(index-1-count1,list.get(index-1-count1)+","+list.get(index-count1));
			list.remove(index-count1);
			count1++;
		}*/
		
		
		//System.out.println(list);
		String find="venue";
		int find1=getIndex(headers1,find);
		
		int rows=(list.size()+1)/17;
		
		for(int i=0;i<rows;i++) {
			int index=i*17+find1;
			System.out.println(list.get(index));
		}
		
		
		
	}

	public static int getIndex(String[] headers1, String find) {
		for(int i=0;i<headers1.length;i++) {
			if(find.equalsIgnoreCase(headers1[i])) {
				return i;
			}
		}
		return -1;
	}	
}
