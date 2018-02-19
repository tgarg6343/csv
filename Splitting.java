import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Splitting {
	public static void main(String[] args) {
		String splitter="2,2008,Chandigarh,2008-04-19,Chennai Super Kings,Kings XI Punjab,Chennai Super Kings,bat,normal,0,Chennai Super Kings,33,0,MEK Hussey,\"Punjab Cricket Association Stadium, Mohali\",MR Benson,SL Shastri,";
		
		ArrayList<String> list=new ArrayList<String>();
		list.addAll(Arrays.asList(splitter.split("\\b,\\b")));
		/*Iterator<String> iterator=list.iterator();
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
		list.remove(y);*/
		Iterator<String> iterator1=list.iterator();
		while(iterator1.hasNext()) {
			String word=(String)iterator1.next();
			System.out.println(word);
		}
		
		
	}
}