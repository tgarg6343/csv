import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {
public static void main(String[] args) {
	PartsOfFile parts=new PartsOfFile();
	String fileName="ipl.csv";
	FileReader file=null;
	BufferedReader reader=null;
	try {
		
	file=new FileReader(fileName);
	reader=new BufferedReader(file);
	String fileText;
	
	}
	catch(IOException exc) {
		System.out.println(exc.getMessage());
	}
	finally {
		if(file!=null) {
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(reader!=null) {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
}
