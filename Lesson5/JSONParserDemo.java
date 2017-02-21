import java.io.FileReader;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import javax.json.JsonValue;
import javax.json.JsonObject;
import javax.json.JsonNumber;
import javax.json.JsonString;
import javax.json.JsonArray;

public class JSONParserDemo {
	public static void main(String[] args) throws Exception {

      //Create the josnReader object with the file location
		JsonReader reader = Json.createReader(new FileReader("xml/Student.json"));

      // Creates the json tree structure 
		JsonStructure jsonst = reader.read();
		JsonObject object = (JsonObject) jsonst;
      // to navigate the The tree we will use a 
      // custom method that recursively navigates 
      // the complete structure.

		navigateTree(jsonst,"Student");
	}

	public static void navigateTree(JsonValue tree, String key) {
   		if (key != null)
    		System.out.print("Key " + key + ": ");
      // Get the element value type, and 
      // And depending on the type 
      // will execute the code of the matching 
      // condition of the switch statement.
   		switch(tree.getValueType()) {
      		case OBJECT:
         		System.out.println("OBJECT");
         		JsonObject object = (JsonObject) tree;
         		for (String name : object.keySet())
            		navigateTree(object.get(name), name);
         		break;
      		case ARRAY:
         		System.out.println("ARRAY");
         		JsonArray array = (JsonArray) tree;
         		for (JsonValue val : array)
            		navigateTree(val, null);
         		break;
      		case STRING:
         		JsonString st = (JsonString) tree;
         		System.out.println("STRING " + st.getString());
         		break;
      		case NUMBER:
         		JsonNumber num = (JsonNumber) tree;
         		System.out.println("NUMBER " + num.toString());
         		break;
      		case TRUE:
      		case FALSE:
      		case NULL:
         		System.out.println(tree.getValueType().toString());
         	break;
   		}
   	}
}