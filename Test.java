
public class Test {
	public static void main(String[] args) {
		String query="1,2008,Bangalore,2008-04-18,Kolkata Knight Riders,Royal Challengers Bangalore,Royal Challengers Bangalore,field,normal,0,Kolkata Knight Riders,140,0,BB McCullum,M Chinnaswamy Stadium,Asad Rauf,RE Koertzen,";
		Matches match=new Matches(query);
		System.out.println(match.toString());
		
	}
}
