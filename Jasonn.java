  
import java.io.FileWriter;  
import java.io.IOException;  

/*import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;*/

public class Jasonn {  

    public static void main(String[] args) {  

        JSONObject countryObj = new JSONObject();  
        countryObj.put("Name", "India");  
        countryObj.put("Population", new Integer(1000000));  

        JSONArray listOfStates = new JSONArray();  
        listOfStates.add("Madhya Pradesh");  
        listOfStates.add("Maharastra");  
        listOfStates.add("Rajasthan");  

        countryObj.put("States", listOfStates);  

        try {  

            // Writing to a file  
            File file=new File("JsonFile.json");  
            file.createNewFile();  
            FileWriter fileWriter = new FileWriter(file);  
            System.out.println("Writing JSON object to file");  
            System.out.println("-----------------------");  
            System.out.print(countryObj);  

            fileWriter.write(countryObj.toJSONString());  
            fileWriter.flush();  
            fileWriter.close();  
            
            FileWriter fileWriter = new FileWriter("info.json");
			fileWriter.write(jsonObject.toJSONString());
			fileWriter.flush();

        } catch (IOException e) {  
            e.printStackTrace();  
        }  

    }  
}  