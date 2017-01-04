package module3;

import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import interoperabilite.json.entities.Studient;

public class jsonCrud {
	
	
	public Studient selectStudient(int id) {
		
		Studient studient = new Studient();
		
		ObjectMapper mapper = new ObjectMapper();
	
		try {
			
			JsonNode root = mapper.readTree("c:\\user.json");
		} catch(IOException e) {
			
			//
		}
		
		return studient;
	}

}
