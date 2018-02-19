
public class HeaderFields {
	
	public int getIndex(String[] fields,String x) {
		for (int i = 0; i < fields.length; i++) {
			if(fields[i].equalsIgnoreCase(x)) {
				return i;
			}
		}
		return -1;
	}
}