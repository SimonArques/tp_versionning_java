package module3;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import interoperabilite.cour.*;
import interoperabilite.ldap.entities.*;

public class jsonImport {
	public static LdapItem file;
	public void main(String[] args){
		ObjectMapper mapper = new ObjectMapper();
		//User userData = mapper.readValue(new File(file.getScriptPath()), User.class);
	}
}
