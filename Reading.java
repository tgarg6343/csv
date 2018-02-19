import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Reading {
public static void main(String[] args) {
	String data = "";
	String FILENAME="ipl.csv";
	String text="";
	String line1="";
    try {
    	FileReader file=new FileReader(FILENAME);
    	

    	BufferedReader br = new BufferedReader(file);
    	BufferedReader br1 = new BufferedReader(file);
    	while ((line1 = br1.readLine()) != null) {
    	    break;
    	  }
    	  String st;
    	  while ((st = br.readLine()) != null) {
    	    text+=st+",";
    	  }
    	  }
		
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    text.replaceAll("\"", "");
    
	
    
    ArrayList<String> headers=new ArrayList<String>();
    headers.addAll(Arrays.asList(line1.split(",")));
    System.out.println(headers);
    
    //System.out.println(text);
    
   ArrayList<String> list=new ArrayList<String>();
   ArrayList<Integer> indexes=new ArrayList<Integer>();
	list.addAll(Arrays.asList(text.split(",")));
	Iterator<String> iterator1=list.iterator();
	
	
	
	
	/*while(iterator1.hasNext()) {
		String word=(String)iterator1.next();
		
		
		System.out.print(word+"|");
		
	}
	System.out.println("");*/
	
	
	
	int count=0;
	while(iterator1.hasNext()) {
		String word=(String)iterator1.next();
		if(word.startsWith(" "))
		indexes.add(count);	
		
		//System.out.println(word);
		count++;
	}
	
	
	int count1=0;
	Iterator<Integer> i=indexes.iterator();
	while(i.hasNext()) {
		int index=(Integer)i.next();
		list.set(index-1-count1,list.get(index-1-count1)+","+list.get(index-count1));
		list.remove(index-count1);
		
		
		
		//System.out.println(word);
		System.out.println("removing");
		count1++;
	}

	
Iterator<String> iterator2=list.iterator();
	
	while(iterator2.hasNext()) {
		String word=(String)iterator2.next();
		
		
		//System.out.print(word+"|");
		
	}
	
	
	//System.out.println(indexes);
	
    
    
    
    
    
   /* ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>();
    
	list.add(arra)
	Iterator<String> iterator=list.iterator();
	int count=0;
	int y=-1;
	while(iterator.hasNext()) {
		String word=(String)iterator.next();
		if(word.startsWith(" ")) {
			y=count;
		}
		count++;
	}
	list.set(y-1,list.get(y-1)+","+list.get(y));
	list.remove(y);
	Iterator<String> iterator1=list.iterator();
	while(iterator1.hasNext()) {
		String word=(String)iterator1.next();
		System.out.println(word);
	}
	
    
    
    
    
    
    
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
