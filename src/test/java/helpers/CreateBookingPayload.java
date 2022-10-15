package helpers;

import java.io.File;
import java.io.IOException;

public class CreateBookingPayload {
	File file;
public File CreateBookingPayload(String type, String environment) throws IOException {
		
		String DirectoryPath = System.getProperty("user.dir");
		//System.out.println(DirectoryPath);
		if(type.equals("correct")) {
			
			File path = new File(DirectoryPath+"/src/test/resources/data/CreateBookingPayload.json");
			this.file = path;
			//System.out.println("path " + path);
		}
		else {
			
			System.out.println("File Not found!");
		}
		return file;
	}
}
